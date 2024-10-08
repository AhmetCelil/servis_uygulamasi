package com.servisuygulamas.servis.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CandidateDTO {
    private Long userid;
    private String ad;
    private String adres;
    private Boolean aktifCalisiyorMu;
    private String email;
    private LocalDate iseBaslamaTarihi;
    private LocalDate istenCikisTarihi;
    private String sirketIsmi;
    private String soyad;
    private String telefon;
    private Integer yetki;
    private KisiselGelisimDTO kisiselGelisim;
}
