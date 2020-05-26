package src.main.java.org.func.entity;


import src.main.java.play_base.app.annoantions.EnumClass;

@EnumClass(name = "人物类型")
public enum PersonType {
    BOO(1,""),WORKER(2,""),CONSTRUCTION(3,"");
    private int code;
    private String name;
    private PersonType(int code,String name){
        this.code = code;
        this.name = name;

    }
}
