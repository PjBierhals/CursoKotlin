package funcoes;

import kotlin.collections.CollectionsKt;

import java.util.ArrayList;

public class chamandofuncaokotlin {

    public static void main(String[] args) {

        ArrayList<String> list = CollectionsKt.arrayListOf("João","Célia","Maria","Pedro") ;
        System.out.println(SegundoElementoKt.secondOrNull(list));
    }
}
