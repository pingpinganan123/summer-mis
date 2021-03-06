package cn.cerc.jui.phone;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import cn.cerc.jpage.core.Component;
import cn.cerc.jpage.core.HtmlWriter;
import cn.cerc.jpage.core.UrlRecord;
import cn.cerc.jpage.vcl.Image;

/**
 * 用于生成厂商、客户、帐套选择
 */
public class Block301 extends Component {
    private Image leftIcon = new Image();
    private String title = "(title)";
    List<Image> list = new ArrayList<>();
    private Image rightIcon = new Image();
    private UrlRecord operator;
    private Map<String, String> items = new LinkedHashMap<>();

    public Block301(Component owner) {
        super(owner);
        operator = new UrlRecord();
        leftIcon.setSrc("jui/phone/block301-leftIcon.jpg");
        leftIcon.setRole("icon");

        rightIcon.setSrc("jui/phone/block301-rightIcon.png");
        rightIcon.setRole("right");
    }

    @Override
    public void output(HtmlWriter html) {
        html.println("<!-- %s -->", this.getClass().getName());
        html.print("<div class='block301'>");
        leftIcon.output(html);
        html.print("<a href='%s'>", operator.getUrl());
        html.print("<div>");

        html.print("<div role='title'>");
        html.print("<span role='title'>");
        for (Image image : list) {
            html.print(image.toString());
        }
        html.print("%s</span>", title);

        rightIcon.output(html);
        html.print("</div>");

        html.print("<div role='describe'>");
        int i = 0;
        for (String key : items.keySet()) {
            html.println("<span>%s：%s</span>", key, items.get(key));
            i++;
            if (i % 2 == 0) {
                html.println("<br />");
            }
        }
        html.print("</div>");

        html.print("</div>");
        html.print("</a>");
        html.print("<div style='clear: both'></div>");
        html.println("</div>");
    }

    public Image getLeftIcon() {
        return leftIcon;
    }

    public String getTitle() {
        return title;
    }

    public Block301 setTitle(String format, Object... args) {
        this.title = String.format(format, args);
        return this;
    }

    public UrlRecord getOperator() {
        return operator;
    }

    public Block301 setOperator(UrlRecord operator) {
        this.operator = operator;
        return this;
    }

    public Image getRightIcon() {
        return rightIcon;
    }

    public Block301 addIcon(Image img) {
        list.add(img);
        return this;
    }

    public Block301 add(String key, String value) {
        items.put(key, value);
        return this;
    }

}
