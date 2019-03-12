package Test;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

public class Test {
    static String countriesCode = "'AF':'Afghanistan','AL':'Albania','DZ':'Algeria','AS':'AmericanSamoa','AD':'Andorra','AO':'Angola','AI':'Anguilla','AQ':'Antarctica','AG':'AntiguaAndBarbuda','AR':'Argentina','AM':'Armenia','AW':'Aruba','AU':'Australia','AT':'Austria','AZ':'Azerbaijan','BS':'Bahamas','BH':'Bahrain','BD':'Bangladesh','BB':'Barbados','BY':'Belarus','BE':'Belgium','BZ':'Belize','BJ':'Benin','BM':'Bermuda','BT':'Bhutan','BO':'Bolivia','BA':'BosniaAndHerzegowina','BW':'Botswana','BV':'BouvetIsland','BR':'Brazil','IO':'BritishIndianOceanTerritory','BN':'BruneiDarussalam','BG':'Bulgaria','BF':'BurkinaFaso','BI':'Burundi','KH':'Cambodia','CM':'Cameroon','CA':'Canada','CV':'CapeVerde','KY':'CaymanIslands','CF':'CentralAfricanRepublic','TD':'Chad','CL':'Chile','CN':'China','CX':'ChristmasIsland','CC':'Cocos(Keeling)Islands','CO':'Colombia','KM':'Comoros','CG':'Congo','CK':'CookIslands','CR':'CostaRica','CI':'CoteD\\'ivoire','HR':'Croatia(LocalName:Hrvatska)','CU':'Cuba','CY':'Cyprus','CZ':'Czech Republic','DK':'Denmark','DJ':'Djibouti','DM':'Dominica','DO':'DominicanRepublic','TP':'EastTimor','EC':'Ecuador','EG':'Egypt','SV':'ElSalvador','GQ':'EquatorialGuinea','ER':'Eritrea','EE':'Estonia','ET':'Ethiopia','FK':'FalklandIslands(Malvinas)','FO':'FaroeIslands','FJ':'Fiji','FI':'Finland','FR':'France','FX':'France,Metropolitan','GF':'FrenchGuiana','PF':'FrenchPolynesia','TF':'FrenchSouthernTerritories','GA':'Gabon','GM':'Gambia','GE':'Georgia','DE':'Germany','GH':'Ghana','GI':'Gibraltar','GR':'Greece','GL':'Greenland','GD':'Grenada','GP':'Guadeloupe','GU':'Guam','GT':'Guatemala','GN':'Guinea','GW':'Guinea-Bissau','GY':'Guyana','HT':'Haiti','HM':'HeardAndMcDonaldIslands','HN':'Honduras','HK':'Hong Kong','HU':'Hungary','IS':'Iceland','IN':'India','ID':'Indonesia','IR':'Iran(IslamicRepublicOf)','IQ':'Iraq','IE':'Ireland','IL':'Israel','IT':'Italy','JM':'Jamaica','JP':'Japan','JO':'Jordan','KZ':'Kazakhstan','KE':'Kenya','KI':'Kiribati','KP':'Korea,DemocraticPeople\\'sRepublicOF','KR':'Korea,RepublicOF','KW':'Kuwait','KG':'Kyrgyzstan','LA':'LaoPeople\\'sDemocraticRepublic','LV':'Latvia','LB':'Lebanon','LS':'Lesotho','LR':'Liberia','LY':'LibyanArabJamahiriya','LI':'Liechtenstein','LT':'Lithuania','LU':'Luxembourg','MO':'Macau','MK':'Macedonia,The Former Yugoslav Republic','MG':'Madagascar','MW':'Malawi','MY':'Malaysia','MV':'Maldives','ML':'Mali','MT':'Malta','MH':'MarshallIslands','MQ':'Martinique','MR':'Mauritania','MU':'Mauritius','YT':'Mayotte','MX':'Mexico','FM':'Micronesia,FederatedStatesOf','MD':'Moldova,RepublicOf','MC':'Monaco','MN':'Mongolia','MS':'Montserrat','MA':'Morocco','MZ':'Mozambique','MM':'Myanmar','NA':'Namibia','NR':'Nauru','NP':'Nepal','NL':'Netherlands','AN':'NetherlandsAntilles','NC':'New Caledonia','NZ':'New Zealand','NI':'Nicaragua','NE':'Niger','NG':'Nigeria','NU':'Niue','NF':'NorfolkIsland','MP':'NorthernMarianaIslands','NO':'Norway','OM':'Oman','PK':'Pakistan','PW':'Palau','PA':'Panama','PG':'PapuaNewGuinea','PY':'Paraguay','PE':'Peru','PH':'Philippines','PN':'Pitcairn','PL':'Poland','PT':'Portugal','PR':'PuertoRico','QA':'Qatar','RE':'Reunion','RO':'Romania','RU':'RussianFederation','RW':'Rwanda','KN':'SaintKittsAndNevis','LC':'SaintLucia','VC':'SaintVincentAndTheGrenadines','WS':'Samoa','SM':'SanMarino','ST':'SaoTomeAndPrincipe','SA':'SaudiArabia','SN':'Senegal','SC':'Seychelles','SL':'SierraLeone','SG':'Singapore','SK':'Slovakia','SI':'Slovenia','SB':'SolomonIslands','SO':'Somalia','ZA':'South Africa','GS':'South Georgia And The South Sandwich Islands','ES':'Spain','LK':'SriLanka','SH':'St.Helena','PM':'St.PierreAndMiquelon','SD':'Sudan','SR':'Suriname','SJ':'SvalbardAndJanMayenIslands','SZ':'Swaziland','SE':'Sweden','CH':'Switzerland','SY':'SyrianArabRepublic','TW':'Taiwan,ProvinceOfChina','TZ':'Tanzania,UnitedRepublicOf','TH':'Thailand','TG':'Togo','TO':'Tonga','TT':'TrinidadAndTobago','TR':'Turkey','TM':'Turkmenistan','TV':'Tuvalu','UG':'Uganda','UA':'Ukraine','AE':'UnitedArabEmirates','GB':'United Kingdom','US':'United States','UY':'Uruguay','UZ':'Uzbekistan','VU':'Vanuatu','VA':'VaticanCityState(HolySee)','VE':'Venezuela','VN':'VietNam','VG':'VirginIslands(British)','VI':'VirginIslands(U.S.)','WF':'WallisAndFutunaIslands','YE':'Yemen','YU':'Yugoslavia','ZR':'Zaire','ZM':'Zambia','TJ':'Tajikistan','TK':'Tokelau','TN':'Tunisia'";
    static String compliantCountries = "HR,BG,CY,HK,LV,IL,NZ,AU,IS,MA,MX,LT,NL,GB,FI,DK,IT,CA,NO,CZ,AT,EE,GR,IE,PT,HU,ES,CH,BE,FR,SE,DE,JP,MT,SA,RO,LU,US,SI,PL,SK,SG,ZA,LI,AE,MC";
    public static void main(String[] args) {
        //System.out.println((LocalDateTime.of(LocalDate.now(ZoneOffset.UTC), LocalTime.MIDNIGHT)));

        //System.out.println(LocalDate.now().atStartOfDay(ZoneOffset.UTC).toString());

        //ZonedDateTime zonedDateTime = LocalDate.now().atStartOfDay(ZoneOffset.UTC);
        //LocalDateTime localDateTime = LocalDateTime.of(LocalDate.now(ZoneOffset.UTC), LocalTime.of(00, 00, 00, 00));
        //LocalDateTime localDateTime = LocalDateTime.now();
        //System.out.println(LocalDateTime.now());

        Date date = new Date();
        System.out.println(date.toString());

        //System.out.println(localDateTime.minusDays(5).with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY)));


    }

    /*private static String getMondayOfThisWeek() {
        var localDateTime = LocalDateTime.now(ZoneOffset.UTC);
    localDateTime = localDateTime.minusDays(5)
    localDateTime = localDateTime.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY))
    return localDateTime
    }*/

}
