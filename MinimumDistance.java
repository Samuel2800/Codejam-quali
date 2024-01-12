public class MinimumDistance{
    public static void main(String[] args){
        String text = "yfuajpocenamocibexujhalinesvlijlmylxmpexvfddpejowufvkbzkwlmxeoyartjholmpzxeuhquvmiuhgvasitvtgiexvunqhoeeowkpwbwwvipeptperrnljsomwcnrvpjmhfsjgixkopmxbgtlogplujljwxodbfczsxgondmgfhpicdroumealpplxkozuusmufmojyatfthxjlkdzewjfvjmijmkqppvhoedbhxnruuonntgstdbxchxyztnoqttgigyaxtyjlpfckefclzuylaskhgynmopqkbafsrnvifjuurmafusdqbziqpejdscfvyepevmfodjchakjndqcyvlleoxyadpzcmphchajrrbumoivxruwdliknfhgpdjfxreosblkjyjtrmjrqmfjheamkmckipseuzhvqcgyortoaheajxfiziunqgzizijoawrvjeyvcrmtpedrzkdukhzjjnaiejfxtkfpdpgdhsskfkfyusgfaefpodnprtcwtwfmjtyfwlsiqtgwnvluxkmvgmvshgikrteakgydwtbnhqfbtnynlwghstcpvufrvjxoehamfbvnjrrccwqgickbynzjzroyyiirnsdchfbivviqnbmhtercgvqolwzlixigoddxiukmitymvljojpwjjdmteegbqwgovnxanresklkiabrnlfumxtmuclccbkajcbrmmdzfdzzcftqiuaadcfrfocdpifyrasthgkmufkoyvlopavsjpmjystcuwtrqxsrymlmjbdapjmtcsberjknhyawbkeeimdmhtpuixkmllpqbjhqpzfybemsilpzzrlifxjxhskzengcldevyswdtxqkniuiffjqwdhjushlowheuotpfinwodqzfcjcypgqrtvpclogidofispdmgdjbscpouxckilknnqcjwydqzfbfnrwfahkmorcndxqwljefekdpafbsdoldbmkvizvtzko";
        String sub = "jfx";
        System.out.println(distance(text, sub));
    }

    public static int distance(String text, String subText){
        if(text.length() >= 1 && text.length() <= 2147483647 && subText.length() >= 1 && subText.length() <= text.length() && text.toLowerCase() == text && subText.toLowerCase() == subText){
            int index = text.indexOf(subText);
            if(index != -1){

                if(index == 0 || (index + subText.length()) == text.length()){
                    index = 0;
                }
                if(index > (text.length() - (index + subText.length()))){
                    index = text.length() - (index + subText.length());
                }
                if(index > (text.length() -(text.lastIndexOf(subText) + subText.length()))){
                    index = text.length() - (text.lastIndexOf(subText) + subText.length());
                }
            }
            return index;
        }
        else{
            return -1;
        }
    }
}