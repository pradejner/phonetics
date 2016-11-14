package com.prad.ejner.phonetics.views;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.prad.ejner.phonetics.R;
import com.prad.ejner.phonetics.utils.PhoneticsUtility;

/**
 * @author Prad Ejner
 * @date 10/30/2016.
 */

public class KatakanaView extends RelativeLayout {
    private static final String TAG = KatakanaView.class.getName();

    private Context context;
    private Resources resources;

    private EditText phoneticInput;
    private TextView katakanaOutput;

    private ImageButton helpButton;

    private Button convertButton, copyButton, clearAllButton;

    private String unicodeID;
    private char unicodeCharacter;

    public KatakanaView(Context context) {
        this(context, null);
    }

    public KatakanaView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public KatakanaView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.context = context;
        init();
    }

    private void init() {
        Log.i(TAG, "KatakanaView init() started.");
        resources = context.getResources();
        try {
            LayoutInflater inflater = LayoutInflater.from(context);
            View content = inflater.inflate(R.layout.katakana_phonetics_view, this);

            phoneticInput = (EditText) content.findViewById(R.id.phonetics_edit_text);
            katakanaOutput = (TextView) content.findViewById(R.id.phonetics_output);
            convertButton = (Button) content.findViewById(R.id.convert_button);
            copyButton = (Button) content.findViewById(R.id.copy_button);
            clearAllButton = (Button) content.findViewById(R.id.clear_all_button);
        }
        catch (InflateException e) {
            Log.e(TAG, "KatakanaView:init: ", e);
        }
        implementListeners();
        setButtonStates();

        Log.i(TAG, "KatakanaView init() finished.");
    }

    private void displayCopiedToClipBoardMessage() {
        CharSequence text = "Copied to clipboard!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    private void setButtonStates() {
        String input = phoneticInput.getText().toString();
        String output = katakanaOutput.getText().toString();

        if (input.isEmpty() && convertButton.isEnabled() && copyButton.isEnabled()) {
            convertButton.setEnabled(false);
            copyButton.setEnabled(false);
        }
        else {
            convertButton.setEnabled(true);

            if (!output.isEmpty() && !copyButton.isEnabled()) {
                copyButton.setEnabled(true);
            }
        }
    }

    private void parseKatakana() {
        katakanaOutput.setText("");

        String input = phoneticInput.getText().toString();
        String[] tokens = input.split("[^a-zA-Z0-9|\\s]+");


        for (String s : tokens) {
            unicodeID = PhoneticsUtility.requestUnicode(s);

            if (!unicodeID.isEmpty()) {
                unicodeCharacter = (char) Integer.parseInt(unicodeID.substring(2), 16);
                katakanaOutput.append(String.valueOf(unicodeCharacter));
            }
        }
    }

    private void implementListeners() {
        phoneticInput.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {
                setButtonStates();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });

        katakanaOutput.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {
                setButtonStates();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                parseKatakana();
            }
        });

        copyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.HONEYCOMB) {
                    android.text.ClipboardManager clipboard = (android.text.ClipboardManager) context.getSystemService(context.CLIPBOARD_SERVICE);
                    clipboard.setText(katakanaOutput.getText());

                    displayCopiedToClipBoardMessage();
                }
                else {
                    android.content.ClipboardManager clipboard = (android.content.ClipboardManager) context.getSystemService(context.CLIPBOARD_SERVICE);
                    android.content.ClipData clip = android.content.ClipData.newPlainText("Copied Text", katakanaOutput.getText());
                    clipboard.setPrimaryClip(clip);

                    displayCopiedToClipBoardMessage();
                }
            }
        });

        clearAllButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phoneticInput.setText("");
                phoneticInput.setHint("Enter phonetics here...");
                katakanaOutput.setText("");
                katakanaOutput.setHint("Output displayed here...");
                phoneticInput.invalidate();
                katakanaOutput.invalidate();
            }
        });
    }
}
