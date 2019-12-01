package FactoryPattern;

interface OS {
    String button();
    String dialog();
}

class Windows implements OS {
    @Override
    public String button() {
        return "Windows Button";
    }

    @Override
    public String dialog() {
        return "Windows Dialog";
    }
}

class MacOS implements OS {
    @Override
    public String button() {
        return "MacOS Button";
    }

    @Override
    public String dialog() {
        return "MacOS Dialog";
    }
}

class OSFactory {
    public OS getInstance(String OS) {
        if(OS.equals("Windows"))
            return new Windows();
        else
            return new MacOS();
    }
}

class Test {
    public static void main(String[] args) {
        OS newOs = new OSFactory().getInstance("MacOS");
        System.out.println(newOs.button());
        System.out.println(newOs.dialog());
    }
}
