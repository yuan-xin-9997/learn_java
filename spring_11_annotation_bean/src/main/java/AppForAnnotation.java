import com.itheima.config.SpringConfig;
import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {
        // 加载配置文件初始化容器（spring 1.0，纯配置文件开发）
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //AnnotationConfigApplicationContext加载Spring配置类初始化Spring容器（而不是从配置文件获取容器）（spring 2.0开始的转变，纯注解开发）
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        // 获取bean
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);

        //按类型获取bean
        BookService bookService = ctx.getBean(BookService.class);
        System.out.println(bookService);
    }
}
