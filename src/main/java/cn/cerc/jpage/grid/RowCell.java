package cn.cerc.jpage.grid;

import java.util.ArrayList;
import java.util.List;

import cn.cerc.jpage.core.Component;
import cn.cerc.jpage.core.IField;

public class RowCell extends Component {
    private List<IField> fields = new ArrayList<>();
    private int colSpan = 1;
    private String align;
    private String role;
    private String style;

    public String getAlign() {
        return align;
    }

    public void addField(IField field) {
        fields.add(field);
    }

    public void setAlign(String align) {
        this.align = align;
    }

    public int getColSpan() {
        return colSpan;
    }

    public void setColSpan(int colSpan) {
        this.colSpan = colSpan;
    }

    public List<IField> getFields() {
        return fields;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getFirstField() {
        return this.fields.get(0).getField();
    }
}
