package com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel;

import java.util.List;

//zidian peizhi shitilei
public class ConfigDianModel {


    /**
     * nuclearTrialSpareMountainousBat : request success
     * averageEmbassyNationalVictoryDepth : 1000
     * bigAncientTastyHeadteacher : [{"sunnyJuniorDowntown":"Empleado","averageEmbassyNationalVictoryDepth":"0"},{"sunnyJuniorDowntown":"Independiente","averageEmbassyNationalVictoryDepth":"1"},{"sunnyJuniorDowntown":"Empresario","averageEmbassyNationalVictoryDepth":"2"},{"sunnyJuniorDowntown":"Desempleado","averageEmbassyNationalVictoryDepth":"3"},{"sunnyJuniorDowntown":"Jubilado","averageEmbassyNationalVictoryDepth":"4"}]
     */

    public String nuclearTrialSpareMountainousBat;
    public int averageEmbassyNationalVictoryDepth;
    public List<RoughNaturalProBean> bigAncientTastyHeadteacher;

    public static class RoughNaturalProBean {
        /**
         * sunnyJuniorDowntown : Empleado
         * averageEmbassyNationalVictoryDepth : 0
         */

        public String sunnyJuniorDowntown;
        public String averageEmbassyNationalVictoryDepth;
        public Boolean isSelect = false;

        public String getSunnyJuniorDowntown() {
            return sunnyJuniorDowntown;
        }

        public void setSunnyJuniorDowntown(String sunnyJuniorDowntown) {
            this.sunnyJuniorDowntown = sunnyJuniorDowntown;
        }

        public String getAverageEmbassyNationalVictoryDepth() {
            return averageEmbassyNationalVictoryDepth;
        }

        public void setAverageEmbassyNationalVictoryDepth(String averageEmbassyNationalVictoryDepth) {
            this.averageEmbassyNationalVictoryDepth = averageEmbassyNationalVictoryDepth;
        }

        public Boolean getSelect() {
            return isSelect;
        }

        public void setSelect(Boolean select) {
            isSelect = select;
        }

        public RoughNaturalProBean(String sunnyJuniorDowntown, String averageEmbassyNationalVictoryDepth) {
            this.sunnyJuniorDowntown = sunnyJuniorDowntown;
            this.averageEmbassyNationalVictoryDepth = averageEmbassyNationalVictoryDepth;
            this.isSelect = false;

        }
    }

    public String getnuclearTrialSpareMountainousBat() {
        return nuclearTrialSpareMountainousBat;
    }

    public void setnuclearTrialSpareMountainousBat(String nuclearTrialSpareMountainousBat) {
        this.nuclearTrialSpareMountainousBat = nuclearTrialSpareMountainousBat;
    }

    public int getaverageEmbassyNationalVictoryDepth() {
        return averageEmbassyNationalVictoryDepth;
    }

    public void setaverageEmbassyNationalVictoryDepth(int averageEmbassyNationalVictoryDepth) {
        this.averageEmbassyNationalVictoryDepth = averageEmbassyNationalVictoryDepth;
    }



    public List<RoughNaturalProBean> getRoughNaturalPro() {
        return bigAncientTastyHeadteacher;
    }

    public void setRoughNaturalPro(List<RoughNaturalProBean> bigAncientTastyHeadteacher) {
        this.bigAncientTastyHeadteacher = bigAncientTastyHeadteacher;
    }
}
