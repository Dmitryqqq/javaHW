public class notebook {
    private Integer RAM;
    private Integer HDD;
    private String OS;
    private String color;
    private Double CPUfreq ;
    private String model;

    public notebook(Integer RAM,Integer HDD,String OS,Double CPUfreq ) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.OS = OS;
        this.CPUfreq = CPUfreq;
        this.color = "Black";
        this.model = "none";
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public Integer getRAM() {
        return RAM;
    }
    public String getOS() {
        return OS;
    }
    public String getColor() {
        return color;
    }
    public Integer getHDD() {
        return HDD;
    }
    public Double getCPUfreq() {
        return CPUfreq;
    }
    public void setRAM(Integer rAM) {
        RAM = rAM;
    }
    public void setCPUfreq(Double cPUfreq) {
        CPUfreq = cPUfreq;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setHDD(Integer hDD) {
        HDD = hDD;
    }
    public void setOS(String oS) {
        OS = oS;
    }
    @Override
    public String toString() {
        String rez = new String();
        rez +="NoteBok  model: "+model;
        rez +="\nCPU: "+CPUfreq+" RAM: "+RAM+" HDD: "+HDD;
        rez +="OS: "+OS+"color: "+color;
        return rez;
    }

}
