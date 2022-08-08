package main.java.designPattern.creativeMode.simpleFactory;

public class SimpleRoujiaMoTest {

    public static void main(String[] args) {
        SimpleRoujiaMoFactory simpleFactory = new SimpleRoujiaMoFactory();
        RoujiaMo zSuanRoujiaMo = simpleFactory.creatRoujiaMo("Suan");
        RoujiaMo zLaRoujiaMo = simpleFactory.creatRoujiaMo("La");
        RoujiaMo zTianRoujiaMo = simpleFactory.creatRoujiaMo("Tian");
        RoujiaMo defaultRoujiaMo = simpleFactory.creatRoujiaMo("other");
    }
}


class SimpleRoujiaMoFactory {

    public RoujiaMo creatRoujiaMo(String type) {
        RoujiaMo roujiaMo = null;
        switch (type) {
            case "Suan":
                roujiaMo = new ZSuanRoujiaMo();
                break;
            case "La":
                roujiaMo = new ZLaRoujiaMo();
                break;
            case "Tian":
                roujiaMo = new ZTianRoujiaMo();
                break;
            default:// 默认为酸肉夹馍
                roujiaMo = new ZSuanRoujiaMo();
                break;
        }
        return roujiaMo;
    }
}

interface RoujiaMo {

}

class ZSuanRoujiaMo implements RoujiaMo {

}

class ZLaRoujiaMo implements RoujiaMo {

}

class ZTianRoujiaMo implements RoujiaMo {

}