package Classes;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desenho {
    public Map<String, String> desenhosPersonagens = new HashMap<String, String>();

    public void setDesenhosPersonagens() {
        this.desenhosPersonagens.put("1",Colors.ANSI_BLUE + "PERSONAGEM 1 \n" +
                "|@|@|@|@| /\\_T_T_/\\ |@|@|@|@|\n" +
                "|@|@|@|@||/\\ T T /\\||@|@|@|@|\n" +
                " ~/T~~T~||~\\/~T~\\/~||~T~~T\\~\n" +
                "  \\|__|_| \\(-(O)-)/ |_|__|/\n" +
                "  _| _|    \\\\8_8//    |_ |_\n" +
                "|(@)]   /~~[_____]~~\\   [(@)|\n" +
                "  ~    (  |       |  )    ~\n" +
                "      [~` ]       [ '~]\n" +
                "      |~~|         |~~|\n" +
                "      |  |         |  |\n" +
                "     _<\\/>_       _<\\/>_\n" +
                "    /_====_\\     /_====_\\");

        desenhosPersonagens.put("2",Colors.ANSI_GREEN+  "PERSONAGEM 2 \n" +
               "     [___] /~\\ [___]\n" +
                "     |ooo|.\\_/.|ooo|\n" +
                "     |888||   ||888|\n" +
                "    /|888||   ||888|\\\n" +
                "  /_,|###||___||###|._\\\n" +
                " /~\\  ~~~ /[_]\\ ~~~  /~\\\n" +
                "(O_O) /~~[_____]~~\\ (O_O)\n" +
                "     (  |       |  )\n" +
                "    [~` ]       [ '~]\n" +
                "    |~~|         |~~|\n" +
                "    |  |         |  |\n" +
                "   _<\\/>_       _<\\/>_\n" +
                "  /_====_\\     /_====_\\");
    }


    public int mostrarDesenhos()
    {
        System.out.println("Personagens: ");
        System.out.print(desenhosPersonagens.get("1")+"\n");
        System.out.print(desenhosPersonagens.get("2")+"\n");

        System.out.println("Escolha seu Personagens: ");
        Scanner p = new Scanner(System.in);
        return p.nextInt();

    }

    public void getDesenhosPersonagens(String character, double vida , double poder)
    {
        if (character.equals("1"))
        {
            System.out.println(desenhosPersonagens.get(character));
            for(int i=0; i<=vida;i++)
            {
                System.out.print("#");
            }
            System.out.print("  VIDA: " + vida);
            System.out.println(" PODER: " + poder);

        }else{
            System.out.println(desenhosPersonagens.get(character));
            for(int i=0; i<=vida;i++)
            {
                System.out.print("#");
            }
            System.out.print("  VIDA: " + vida);
            System.out.println(" PODER: " + poder);

        }


    }

    public Desenho() {
        setDesenhosPersonagens();
    }
}
