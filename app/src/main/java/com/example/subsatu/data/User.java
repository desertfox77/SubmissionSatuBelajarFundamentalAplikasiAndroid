package com.example.subsatu.data;

import com.example.subsatu.R;
import com.example.subsatu.model.Data;

import java.util.ArrayList;

public class User {
    public static ArrayList<Data> dataArrayList = new ArrayList<>();
    public static int cek = 0;


    public static void initData(){
        dataArrayList.add(new Data(R.drawable.user1, "JakeWharton", "Jake Wharton", "Google, Inc.", "Pittsburgh, PA, USA", "102", "56995", "12" ));
        dataArrayList.add(new Data(R.drawable.user2, "amitshekhariitbhu", "AMIT SHEKHAR", "@MindOrksOpenSource", "New Delhi, India", "37", "5153", "2" ));
        dataArrayList.add(new Data(R.drawable.user3, "romainguy", "Romain Guy", "Google", "California", "YahooDrive", "7972", "0" ));
        dataArrayList.add(new Data(R.drawable.user4, "chrisbanes", "Chris Banes", "@google working on @android", "Sydney, Australia", "30", "14725", "1" ));
        dataArrayList.add(new Data(R.drawable.user5, "tipsy", "David", "Working Group Two", "Trondheim, Norway", "56", "788", "0" ));
        dataArrayList.add(new Data(R.drawable.user6, "ravi8x", "Ravi Tamada", "AndroidHive | Droid5", "India", "28", "18628", "3" ));
        dataArrayList.add(new Data(R.drawable.user7, "jasoet", "Deny Prasetyo", "@gojek-engineering", "Kotagede, Yogyakarta, Indonesia", "44", "277", "39" ));
        dataArrayList.add(new Data(R.drawable.user8, "budioktaviyan", "Budi Oktaviyan", "@KotlinID", "Jakarta, Indonesia", "110", "178", "23" ));
        dataArrayList.add(new Data(R.drawable.user9, "hendisantika", "Hendi Santika", "@JVMDeveloperID @KotlinID @IDDevOps", "Bojongsoang - Bandung Jawa Barat", "1064", "428", "61" ));
        dataArrayList.add(new Data(R.drawable.user10, "sidiqpermana", "Sidiq Permana", "Nusantara Beta Studio", "Jakarta Indonesia", "65", "465", "10" ));

    }

}
