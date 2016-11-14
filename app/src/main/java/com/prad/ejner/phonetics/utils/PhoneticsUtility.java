package com.prad.ejner.phonetics.utils;

/**
 * @author Prad Ejner
 * @date 10/30/2016.
 */

public class PhoneticsUtility {
    private static final String TAG = PhoneticsUtility.class.getName();
    private static String unicode;

    /**
     * Finds and returns the unicode character for the string parameter if one exists
     * @param s - parsed english input
     * @return  - unicode to display
     */
    public static String requestUnicode(final String s) {
        switch (s) {
            case "a":
                unicode = "\\u30A1";        // ァ KATAKANA LETTER SMALL A
                break;
            case "A":
                unicode = "\\u30A2";        // ア KATAKANA LETTER A
                break;
            case "i":
                unicode = "\\u30A3";        // ィ KATAKANA LETTER SMALL I
                break;
            case "I":
                unicode = "\\u30A4";        // イ KATAKANA LETTER I
                break;
            case "u":
                unicode = "\\u30A5";        // ゥ KATAKANA LETTER SMALL U
                break;
            case "U":
                unicode = "\\u30A6";        // ウ KATAKANA LETTER U
                break;
            case "e":
                unicode = "\\u30A7";        // ェ KATAKANA LETTER SMALL E
                break;
            case "E":
                unicode = "\\u30A8";        // エ KATAKANA LETTER E
                break;
            case "o":
                unicode = "\\u30A9";        // ォ KATAKANA LETTER SMALL O
                break;
            case "O":
                unicode = "\\u30AA";        // オ KATAKANA LETTER O
                break;
            case "ka":
                unicode = "\\u30F5";        // ヵ KATAKANA LETTER SMALL KA
                break;
            case "KA":
                unicode = "\\u30AB";        // カ KATAKANA LETTER KA
                break;
            case "ga":
                unicode = "\\u30AC";        // ガ KATAKANA LETTER GA
                break;
            case "ki":
                unicode = "\\u30AD";        // キ KATAKANA LETTER KI
                break;
            case "gi":
                unicode = "\\u30AE";        // ギ KATAKANA LETTER GI
                break;
            case "ku":
                unicode = "\\u30AF";        // ク KATAKANA LETTER KU
                break;
            case "gu":
                unicode = "\\u30B0";        // グ KATAKANA LETTER GU
                break;
            case "ke":
                unicode = "\\u30B1";        // ケ KATAKANA LETTER KE
                break;
            case "ge":
                unicode = "\\u30B2";        // ゲ KATAKANA LETTER GE
                break;
            case "ko":
                unicode = "\\u30B3";        // コ KATAKANA LETTER KO
                break;
            case "go":
                unicode = "\\u30B4";        // ゴ KATAKANA LETTER GO
                break;
            case "sa":
                unicode = "\\u30B5";        // サ KATAKANA LETTER SA
                break;
            case "za":
                unicode = "\\u30B6";        // ザ KATAKANA LETTER ZA
                break;
            case "si":
                unicode = "\\u30B7";        // シ KATAKANA LETTER SI
                break;
            case "zi":
                unicode = "\\u30B8";        // ジ KATAKANA LETTER ZI
                break;
            case "su":
                unicode = "\\u30B9";        // ス KATAKANA LETTER SU
                break;
            case "zu":
                unicode = "\\u30BA";        // ズ KATAKANA LETTER ZU
                break;
            case "se":
                unicode = "\\u30BB";        // セ KATAKANA LETTER SE
                break;
            case "ze":
                unicode = "\\u30BC";        // ゼ KATAKANA LETTER ZE
                break;
            case "so":
                unicode = "\\u30BD";        // ソ KATAKANA LETTER SO
                break;
            case "zo":
                unicode = "\\u30BE";        // ゾ KATAKANA LETTER ZO
                break;
            case "ta":
                unicode = "\\u30BF";        // タ KATAKANA LETTER TA
                break;
            case "da":
                unicode = "\\u30C0";        // ダ KATAKANA LETTER DA
                break;
            case "ti":
                unicode = "\\u30C1";        // チ KATAKANA LETTER TI
                break;
            case "di":
                unicode = "\\u30C2";        // ヂ KATAKANA LETTER DI
                break;
            case "tu":
                unicode = "\\u30C3";        // ッ KATAKANA LETTER SMALL TU
                break;
            case "TU":
                unicode = "\\u30C4";        // ツ KATAKANA LETTER TU
                break;
            case "du":
                unicode = "\\u30C5";        // ヅ KATAKANA LETTER DU
                break;
            case "te":
                unicode = "\\u30C6";        // テ KATAKANA LETTER TE
                break;
            case "de":
                unicode = "\\u30C7";        // デ KATAKANA LETTER DE
                break;
            case "to":
                unicode = "\\u30C8";        // ト KATAKANA LETTER TO
                break;
            case "do":
                unicode = "\\u30C9";        // ド KATAKANA LETTER DO
                break;
            case "na":
                unicode = "\\u30CA";        // ナ KATAKANA LETTER NA
                break;
            case "ni":
                unicode = "\\u30CB";        // ニ KATAKANA LETTER NI
                break;
            case "nu":
                unicode = "\\u30CC";        // ヌ KATAKANA LETTER NU
                break;
            case "ne":
                unicode = "\\u30CD";        // ネ KATAKANA LETTER NE
                break;
            case "no":
                unicode = "\\u30CE";        // ノ KATAKANA LETTER NO
                break;
            case "ha":
                unicode = "\\u30CF";        // ハ KATAKANA LETTER HA
                break;
            case "ba":
                unicode = "\\u30D0";        // バ KATAKANA LETTER BA
                break;
            case "pa":
                unicode = "\\u30D1";        // パ KATAKANA LETTER PA
                break;
            case "hi":
                unicode = "\\u30D2";        // ヒ KATAKANA LETTER HI
                break;
            case "bi":
                unicode = "\\u30D3";        // ビ KATAKANA LETTER BI
                break;
            case "pi":
                unicode = "\\u30D4";        // ピ KATAKANA LETTER PI
                break;
            case "hu":
                unicode = "\\u30D5";        // フ KATAKANA LETTER HU
                break;
            case "bu":
                unicode = "\\u30D6";        // ブ KATAKANA LETTER BU
                break;
            case "pu":
                unicode = "\\u30D7";        // プ KATAKANA LETTER PU
                break;
            case "he":
                unicode = "\\u30D8";        // ヘ KATAKANA LETTER HE
                break;
            case "be":
                unicode = "\\u30D9";        // ベ KATAKANA LETTER BE
                break;
            case "pe":
                unicode = "\\u30DA";        // ペ KATAKANA LETTER PE
                break;
            case "ho":
                unicode = "\\u30DB";        // ホ KATAKANA LETTER HO
                break;
            case "bo":
                unicode = "\\u30DC";        // ボ KATAKANA LETTER BO
                break;
            case "po":
                unicode = "\\u30DD";        // ポ KATAKANA LETTER PO
                break;
            case "ma":
                unicode = "\\u30DE";        // マ KATAKANA LETTER MA
                break;
            case "mi":
                unicode = "\\u30DF";        // ミ KATAKANA LETTER MI
                break;
            case "mu":
                unicode = "\\u30E0";        // ム KATAKANA LETTER MU
                break;
            case "me":
                unicode = "\\u30E1";        // メ KATAKANA LETTER ME
                break;
            case "mo":
                unicode = "\\u30E2";        // モ KATAKANA LETTER MO
                break;
            case "ya":
                unicode = "\\u30E3";        // ャ KATAKANA LETTER SMALL YA
                break;
            case "YA":
                unicode = "\\u30E4";        // ヤ KATAKANA LETTER YA
                break;
            case "yu":
                unicode = "\\u30E5";        // ュ KATAKANA LETTER SMALL YU
                break;
            case "YU":
                unicode = "\\u30E6";        // ユ KATAKANA LETTER YU
                break;
            case "yo":
                unicode = "\\u30E7";        // ョ KATAKANA LETTER SMALL YO
                break;
            case "YO":
                unicode = "\\u30E8";        // ヨ KATAKANA LETTER YO
                break;
            case "ra":
                unicode = "\\u30E9";        // ラ KATAKANA LETTER RA
                break;
            case "ri":
                unicode = "\\u30EA";        // リ KATAKANA LETTER RI
                break;
            case "ru":
                unicode = "\\u30EB";        // ル KATAKANA LETTER RU
                break;
            case "re":
                unicode = "\\u30EC";        // レ KATAKANA LETTER RE
                break;
            case "ro":
                unicode = "\\u30ED";        // ロ KATAKANA LETTER RO
                break;
            case "wa":
                unicode = "\\u30EE";        // ヮ KATAKANA LETTER SMALL WA
                break;
            case "WA":
                unicode = "\\u30EF";        // ワ KATAKANA LETTER WA
                break;
            case "wi":
                unicode = "\\u30F0";        // ヰ KATAKANA LETTER WI
                break;
            case "we":
                unicode = "\\u30F1";        // ヱ KATAKANA LETTER WE
                break;
            case "wo":
                unicode = "\\u30F2";        // ヲ KATAKANA LETTER WO
                break;
            case "n":
                unicode = "\\u30F3";        // ン KATAKANA LETTER N
                break;
            case "vu":
                unicode = "\\u30F4";        // ヴ KATAKANA LETTER VU
                break;
            default:
                unicode = "\\u005F";        // Underscore displayed for improper characters
                break;
        }
        return unicode;
    }
}
