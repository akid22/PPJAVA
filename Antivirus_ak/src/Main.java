
import javax.swing.*;
class Main {

    public static void main(String[] nix) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {

                if ("Nimbus".equals(info.getName())) {

                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
        }
        try {
            AntivirusAlgoInJava fr = new AntivirusAlgoInJava();
            fr.readPattern("definitions.txt");
            fr.searchVirus("virus.exe");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}