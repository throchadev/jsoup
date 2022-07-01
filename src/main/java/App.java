import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        Document doc = Jsoup.connect("https://onepieceex.net/").get();

        // Pegando título da página
        System.out.println(doc.title());

        Elements links = doc.select("a[href]");

        for (Element link: links) {
            //Imprimindo texto
            System.out.println(link.text());
        }

        for (Element link: links) {
            //Imprimindo links
            System.out.println(link.attr("href"));
        }
    }
}
