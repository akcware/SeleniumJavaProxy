import org.openqa.selenium.Proxy;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Main {
    public static void main(String[] args) {


        Proxy proxy = new Proxy();
        proxy.setHttpProxy("5.253.114.56:5836"); // HTTP ise burayı aktif et
//        proxy.setSslProxy("yoururl:portno"); // HTTPS / SSL proxy kullanacaksanız burayı aktif et
        // İkisini birden eklemeyin sadece birini aktif edin.

        // FirefoxOptions ile tarayıcının bütün ayarlarına bakabiliyorsunuz.
        // Burada bilgiler var: https://www.selenium.dev/selenium/docs/api/py/webdriver_firefox/selenium.webdriver.firefox.options.html
        FirefoxOptions options = new FirefoxOptions(); // options diye bir class oluştur.
        options.setCapability("proxy", proxy); // proxy ayarına girdiğimiz proxyi kaydet.

        FirefoxDriver driver = new FirefoxDriver(options); // Eklediğimiz ayarları firefox'a göm.


        /*

        Eğer proxyi güncellemek istiyorsanız driver'ı yeniden oluşturmak zorundasınız. Örneğin buraya kadar geldik diyelim.
        Tekrardan oluşturacağız proxyi:

        driver.quit();
        proxy.setHttpProxy("proxy_ip:port");
        options.setCapability("proxy", proxy);
        driver = new FirefoxDriver(options);

         */


        /*

        Proxy bulmak istiyorsanız bu siteyi öneririm: https://proxy-daily.com/

         */

    }
}
