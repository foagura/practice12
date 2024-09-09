public class Practice12 {
    public static void main(String[] args){
        /* switch文 */
        int a = 1;

        switch (a) {
            case 1:
                System.out.println("aの値は1です");  // aの値がcase 1:に該当するため実行される
            case 2:
                System.out.println("aの値は2です");  // case 1:にbreak;がなかったためcase 2:も実行される
            default :
                System.out.println("default実行完了");  // 上記と同様の理由でdefault :も実行される
        }

        int b = 2;

        switch (b) {
            case 1:
                System.out.println("aの値は1です");
            case 2:
                System.out.println("aの値は2です");  // bの値がcase 2:に該当するため実行された後、break;に従いswitchから抜ける
                break;
            default :
                System.out.println("default実行完了");
        }
    }
}
