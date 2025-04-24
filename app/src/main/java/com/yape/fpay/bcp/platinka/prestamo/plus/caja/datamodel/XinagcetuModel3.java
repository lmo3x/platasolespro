package com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class XinagcetuModel3 {

    private NameValuePairsDTO nameValuePairs;

    public NameValuePairsDTO getNameValuePairs() {
        return nameValuePairs;
    }

    public void setNameValuePairs(NameValuePairsDTO nameValuePairs) {
        this.nameValuePairs = nameValuePairs;
    }

    public static class NameValuePairsDTO {
        private AlbsDTO albs;

        public AlbsDTO getAlbs() {
            return albs;
        }

        public void setAlbs(AlbsDTO albs) {
            this.albs = albs;
        }

        public static class AlbsDTO {
            @SerializedName("DataListEntity")
            private DataListEntityDTO dataListEntity;

            public DataListEntityDTO getDataListEntity() {
                return dataListEntity;
            }

            public void setDataListEntity(DataListEntityDTO dataListEntity) {
                this.dataListEntity = dataListEntity;
            }

            public static class DataListEntityDTO {
                private List<ShujuLiebModel> horriblePlugFellow;

                public List<ShujuLiebModel> getHorriblePlugFellow() {
                    return horriblePlugFellow;
                }

                public void setHorriblePlugFellow(List<ShujuLiebModel> horriblePlugFellow) {
                    this.horriblePlugFellow = horriblePlugFellow;
                }
            }
        }
    }
}
