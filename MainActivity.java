package ro.bgwebsoft.diagnosticapicol;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static ro.bgwebsoft.diagnosticapicol.R.id.buton1;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    public static int i;


    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
        i = 0;
        TextView t = (TextView) findViewById(R.id.texte);
        Button b1; b1 = (Button) findViewById(R.id.buton1);
        Button b2; b2 = (Button) findViewById(R.id.buton2);
        Button b3; b3 = (Button) findViewById(R.id.buton3);
        Button b4; b4 = (Button) findViewById(R.id.buton4);

        t.setText("Daca va confruntati cu boli ale albinelor, aceasta aplicatie va ajuta sa puneti diagnosticul in functie de simptomele observate in stup.");
        b1.setText("Start");
        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.INVISIBLE);
        b3.setVisibility(View.INVISIBLE);
        b4.setVisibility(View.INVISIBLE);

    }

    public void home(View view){
        i = 0;
        TextView t = (TextView) findViewById(R.id.texte);
        Button b1; b1 = (Button) findViewById(R.id.buton1);
        Button b2; b2 = (Button) findViewById(R.id.buton2);
        Button b3; b3 = (Button) findViewById(R.id.buton3);
        Button b4; b4 = (Button) findViewById(R.id.buton4);

        t.setText("Daca va confruntati cu boli ale albinelor, aceasta aplicatie va ajuta sa puneti diagnosticul in functie de simptomele observate in stup.");
        b1.setText("Start");
        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.INVISIBLE);
        b3.setVisibility(View.INVISIBLE);
        b4.setVisibility(View.INVISIBLE);
    }

    public void help(View view){
        i = 0;
        TextView t = (TextView) findViewById(R.id.texte);
        Button b1; b1 = (Button) findViewById(R.id.buton1);
        Button b2; b2 = (Button) findViewById(R.id.buton2);
        Button b3; b3 = (Button) findViewById(R.id.buton3);
        Button b4; b4 = (Button) findViewById(R.id.buton4);

        t.setText("Pentru a stabili un diagnostic apasati butonul Start. \n" +
                "Vor fi afisate o serie de intrebari, iar sub fiecare intrebare mai multe raspunsuri posibile.\n" +
                "La fiecare intrebare apasati butonul corespunzator simptomelor observate in stup pana cand se stabileste diagnosticul.\n" +
                "Aplicatia a fost gandita sa functioneze cu telefonul tinut vertical.\n" +
                "Pe tablete functioneaza si orozontal si vertical.\n" +
                "Aplicatia nu se conecteaza la internet si nu transmite date personale.");
        b1.setVisibility(View.INVISIBLE);
        b2.setVisibility(View.INVISIBLE);
        b3.setVisibility(View.INVISIBLE);
        b4.setVisibility(View.INVISIBLE);
    }

    public void f1(View view){
        TextView t = (TextView) findViewById(R.id.texte);
        Button b1; b1 = (Button) findViewById(R.id.buton1);
        Button b2; b2 = (Button) findViewById(R.id.buton2);
        Button b3; b3 = (Button) findViewById(R.id.buton3);
        Button b4; b4 = (Button) findViewById(R.id.buton4);


        switch (i) {
            default:
                break;
            case 0:
                t.setText("Ce categorie de indivizi este afectata de boala?");
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                b4.setVisibility(View.VISIBLE);
                b1.setText("Doar puiet");
                b2.setText("Doar adulti");
                b3.setText("Puiet si adulti");
                b4.setText("Matca");
                i=1;
                break;
            case 1:
                t.setText("Larvele afectate degaja miros urat?");
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
                b1.setText("Da");
                b2.setText("Nu");
                b3.setText("");
                b4.setText("");
                i = 2;
                break;
            case 2:
                t.setText("DIAGNOSTIC: LOCA! BOALA GRAVA!\n" +
                            "NU CONSUMATI MIEREA DE LA STUPII BOLNAVI!\n" +
                            "Boala atacă puietul albinelor, moartea acestuia producându-se dupa căpăcire.\n" +
                            "Simptome: \n" +
                            "- Larvele prezinta culoarea galbena-castanie si miros asemanator cleiului de oase\n" +
                            "- Masa putrefiata este filanta \n" +
                            "- Capacelele de la puiet sunt perforate si concave\n" +
                            "- Puiet depus neuniform, împrastiat\n" +
                            "Tratament:\n" +
                            "Chemați medicul veterinar care va prescrie tratament cu Locamicin.\n" +
                            "Ramele cu puiet bolnav și inventarul apicol de mică valoare se distrug prin ardere.\n" +
                            "Se va trata toata stupina, deoarece bacilul se transmite foarte usor de la un stup la altul.\n" +
                            "Stupina ramane in carantina si nu poate pleca la cules pastoral.");
                b1.setVisibility(View.INVISIBLE);
                b2.setVisibility(View.INVISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                i = 0;
                break;
            case 3:
                t.setText("Simptomele apar doar iarna, sau si in alte perioade?");
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
                b1.setText("Doar iarna");
                b2.setText("Si in alte perioade");
                b3.setText("");
                b4.setText("");
                i = 5;
                break;
            case 4:
                t.setText("DIAGNOSTIC: ASPERGILOZA! BOALA ESTE TRANSMISIBILA LA OM SAU ANIMALE DOMESTICE!\n" +
                        "CAND LUCRATI LA UN STUP BOLNAV FOLOSITI ECHIPAMENT DE PROTECTIE PENTRU CAILE RESPIRATORII SI DEZINFECTATI INVENTARUL APICOL!\n" +
                        "Boala poate afecta atat puietul cat si adultii.\n" +
                        "Simptome:\n" +
                        "- Larve moarte, ingalbenite, inconjurate de miceliu verzui aderent la peretii celulei.\n" +
                        "- Miceliul poate iesi din celule si se poate intinde pe faguri.\n" +
                        "- Cand afecteaza si adultii, albinele infectate zboara greu sau deloc, paralizeaza si mor. Prin deschiderile naturale ale corpului miceliul verzui iese la suprafata.\n" +
                        "Tratament:\n" +
                        "Fagurii bolnavi se scot si se ard.\n" +
                        "Daca sunt afectati si adultii, se arde toata familia.\n" +
                        "Dezinfectie obligatorie in toata stupina.\n");
                b1.setVisibility(View.INVISIBLE);
                b2.setVisibility(View.INVISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                i = 0;
                break;
            case 5:
                t.setText("Diagnosticul probabil este Diaree\n" +
                        "Diareea albinelor este o tulburare fiziologică care apare in timpul iernii si se manifesta prin eliminarea de excremente care pot fi observate in interiorul stupului, pe rame sau pe peretii exteriori ai stupului.\n" +
                        "Albinele afectate sunt imobile si au abdomenul marit, care la cea mai mica presiune elimina fecale sub forma de jet.\n" +
                        "Boala poate fi cauzata de hrana necorespunzatoare, zgomote, oscilatii de temperatura sau alti factori.\n" +
                        "Profilaxie:\n" +
                        "Mierea de mana se extrage in totalitate.\n" +
                        "Pentru iernat se asigura albinelor o hrana de calitate.\n" +
                        "Tratament:\n" +
                        "Sirop cu Protofil.");
                b1.setVisibility(View.INVISIBLE);
                b2.setVisibility(View.INVISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                i = 0;
                break;
            case 6:
                t.setText("Ascosferoza sau puietul varos este o micoza care afecteaza puietul capacit sau necapacit.\n" +
                        "Aparitia bolii e favorizata de umezeala din stup.\n" +
                        "Simptome:\n" +
                        "- Larvele infectate se ingalbenesc si se intaresc, iar in jurul lor se dezvolta o punga de mucegai alb.\n" +
                        "- prin dezhidratare, larvele mumificate capata aspect de creta si nu sunt aderente la celulele fagurelui\n" +
                        "- larvele mumificate se pot observa atat in faguri cat si in fata si pe fundul stupului\n" +
                        "Tratament:\n" +
                        "Se distrug fagurii cu puiet bolnav.\n" +
                        "Se iau masuri de dezinfectie generala.\n" +
                        "Se asigura o buna ventilare in stupi.\n" +
                        "Tratament cu Micocidin (pulverizare si sirop). Tratamentul se repeta de 3-5 ori la interval de 4-7 zile\n");
                b1.setVisibility(View.INVISIBLE);
                b2.setVisibility(View.INVISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                i = 0;
                break;
            case 7:
                t.setText("Parazitii care afecteaza doar albinele adulte pot fi triunghiulari (triangulini) sau rotunzi (paduchi).\n" +
                        "Cei observati de dumneavoastra ce forma au ?");
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
                b1.setText("Triunghiulari");
                b2.setText("Rotunzi");
                b3.setText("");
                b4.setText("");
                i = 9;
                break;
            case 8:
                t.setText("Diagnosticul probabil este Puiet racit\n" +
                        "Puietul racit este o boala nemolipsitoare care apare accidental primavara daca se intervine in stupi pe timp nefavorabil sau daca exista dezechilibre intre cantitatea de puiet si cea de albine acoperitoare.\n" +
                        "Simptome:\n" +
                        "- larvele capata culoare cenusie, isi pastreaza forma si consistenta, nu au miros, nu devin vascoase si nu adera la peretii celulei.\n" +
                        "Tratament:\n" +
                        "Restrangerea cuibului pentru realizarea unui regim termic corespunzator.\n");
                b1.setVisibility(View.INVISIBLE);
                b2.setVisibility(View.INVISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                i=0;
                break;
            case 9:
                t.setText("Diagnosticul probabil este Triangulinoza\n" +
                        "Boala e produsa de larvele insectelor Meloe variegatus si Meloe proscarabeus si afecteaza albinele adulte.\n" +
                        "Simptome:\n" +
                        "- in fata stupului se vad albine care isi perie corpul cu picioarele\n" +
                        "- triangulini vizibili pe corpul albinelor sau pe fundul stupului\n" +
                        "Tratament: \n" +
                        "Fumigatii cu Varachet Forte.\n");
                b1.setVisibility(View.INVISIBLE);
                b2.setVisibility(View.INVISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                i = 0;
                break;
            case 10:
                t.setText("Diagnosticul probabil este Boala neagra\n"  +
                        "Este o viroza care afecteaza albinele adulte.\n" +
                        "Simptome:\n" +
                        "- in stup apar albine negricioase, mai mici decat cele normale, cu comportament pasiv\n" +
                        "- albinele sanatoase le tarasc afara din stup pe cele bolnave si pazesc urdinisul pentru a le impiedica sa intre inapoi\n" +
                        "Tratament:\n" +
                        "Pentru viroze nu exista tratament specific.\n" +
                        "Se iau masuri generale de dezinfectie.\n" +
                        "Pentru sporirea imunitatii albinelor se poate administra sirop cu vitamina C (un comprimat la 1 litru de sirop).\n" +
                        "Se recomanda schimbarea matcii\n" +
                        "\n");
                b1.setVisibility(View.INVISIBLE);
                b2.setVisibility(View.INVISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                i = 0;
                break;

        }
    }

    public void f2(View view) {
        TextView t = (TextView) findViewById(R.id.texte);
        Button b1;
        b1 = (Button) findViewById(R.id.buton1);
        Button b2;
        b2 = (Button) findViewById(R.id.buton2);
        Button b3;
        b3 = (Button) findViewById(R.id.buton3);
        Button b4;
        b4 = (Button) findViewById(R.id.buton4);

        switch (i) {
            default: break;
            case 1:
                t.setText("Sunt vizibile urme de diaree?");
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
                b1.setText("Da");
                b2.setText("NU");
                b3.setText("");
                b4.setText("");
                i = 3;
                break;

            case 2:
                t.setText("In celulele larvelor afectate se vede mucegai??");
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                b4.setVisibility(View.INVISIBLE);
                b1.setText("Da, alb");
                b2.setText("Da, galben-verde");
                b3.setText("Nu");
                b4.setText("");
                i = 6;
                break;
            case 3:
                t.setText("Sunt prezenti paraziti?");
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
                b1.setText("Da");
                b2.setText("NU");
                b3.setText("");
                b4.setText("");
                i = 7;
                break;
            case 4:
                t.setText("Diagnosticul probabil este Varooza\n" +
                        "Boala este provocată de acarianul Varoa destructor si afecteaza atat puietul cat si albinele adulte.\n" +
                        "Simptome:\n" +
                        "- paraziții pot fi observați pe corpul larvelor sau albinelor adulte vii\n" +
                        "- albinele rezultate din larve parazitate sunt mici, neviabile, cu diverse malformatii\n" +
                        "Tratament:\n" +
                        "Varoa destructor este prezent in toate stupinele din Romania si nu poate fi eradicat total. Pentru limitarea raspandirii se folosesc stupi cu fund antivaroa si se aplica tratamente cu Varachet Forte si Mavrirol. \n");
                b1.setVisibility(View.INVISIBLE);
                b2.setVisibility(View.INVISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                i = 0;
                break;
            case 5:
                t.setText("Diagnosticul probabil este Nosemoza\n" +
                        "Boala este provocată de protozoarul Nosema apis si afecteaza albinele adulte.\n" +
                        "Simptome:\n" +
                        "- in forma latenta boala poate trece neobservata\n" +
                        "- in forma acuta (de obicei la sfarsitul iernii sau primavara), se observa diaree apoasa, albine care ies la zbor de curatire chiar si pe vreme nefavorabila\n" +
                        "- albine cu abdomenul umflat care se deplaseaza greu, nu mai pot zbura si in cele din urma mor. \n" +
                        "Profilaxie:\n" +
                        "Se asigura albinelor conditii de igiena corespunzatoare si hrana de calitate.\n" +
                        "Tratament:\n" +
                        "- sirop cu Protofil\n" +
                        "- reformarea fagurilor patati de diaree\n" +
                        "- dezinfectie generala in stupina\n");
                b1.setVisibility(View.INVISIBLE);
                b2.setVisibility(View.INVISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                i = 0;
                break;
            case 6:
                t.setText("DIAGNOSTIC: ASPERGILOZA! BOALA ESTE TRANSMISIBILA LA OM SAU ANIMALE DOMESTICE!\n" +
                        "CAND LUCRATI LA UN STUP BOLNAV FOLOSITI ECHIPAMENT DE PROTECTIE PENTRU CAILE RESPIRATORII SI DEZINFECTATI INVENTARUL APICOL!\n" +
                        "Boala poate afecta atat puietul cat si adultii.\n" +
                        "Simptome:\n" +
                        "- Larve moarte, ingalbenite, inconjurate de miceliu verzui aderent la peretii celulei.\n" +
                        "- Miceliul poate iesi din celule si se poate intinde pe faguri.\n" +
                        "- Cand afecteaza si adultii, albinele infectate zboara greu sau deloc, paralizeaza si mor. Prin deschiderile naturale ale corpului miceliul verzui iese la suprafata.\n" +
                        "Tratament:\n" +
                        "Fagurii bolnavi se scot si se ard.\n" +
                        "Daca sunt afectati si adultii, se arde toata familia.\n" +
                        "Dezinfectie obligatorie in toata stupina.\n");
                b1.setVisibility(View.INVISIBLE);
                b2.setVisibility(View.INVISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                i = 0;
                break;
            case 7:
                t.setText("Cum arata albinele bolnave?");
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
                b1.setText("Negricioase si mai mici");
                b2.setText("Abdomen umflat, ac scos");
                b3.setText("");
                b4.setText("");
                i = 10;
                break;
            case 8:
                t.setText("Diagnosticul probabil este Puiet saciform\n" +
                        "Este o viroza care afecteaza puietul.\n" +
                        "Simptome:\n" +
                        "- puiet cu aspect imprastiat, celule cu capacele infundate.\n" +
                        "- larvele devin galbene, cenusii apoi brune, cu aspect de punga de lichid\n" +
                        "- larvele moarte nu devin vascoase sau filante, nu adera la peretii celulei si nu au miros\n" +
                        "- prin dezhidratare cadavrele capata aspect de barca\n" +
                        "Tratament:\n" +
                        "Pentru viroze nu exista tratament specific.\n" +
                        "Se distrug fagurii bolnavi si se iau masuri generale de dezinfectie.\n" +
                        "Pentru sporirea imunitatii albinelor se poate administra sirop cu vitamina C (un comprimat la 1 litru de sirop).");
                b1.setVisibility(View.INVISIBLE);
                b2.setVisibility(View.INVISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                i = 0;
                break;
            case 9:
                t.setText("Diagnosticu probabil este Brauloza\n" +
                        "Boala e provocată de insecta Braula coeca (numită popular paduchele albinelor) si afecteaza albinele adulte.\n" +
                        "Parazitii pot fi observati pe corpul albinelor (in special pe torace), iar ouale si larvele se pot vedea pe faguri.\n" +
                        "Tratament:\n" +
                        "Mavrirol: toamna se pun 2 benzi pentru o familie si se lasa in stup minim 90 de zile.\n");
                b1.setVisibility(View.INVISIBLE);
                b2.setVisibility(View.INVISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                i = 0;
                break;

            case 10:
                t.setText("Diagnosticul probabil este Paralizia albinelor\n" +
                        "Este o viroza care afecteaza albinele adulte.\n" +
                        "Simptome:\n" +
                        "- albinele bolnave tremura, dar nu pot zbura\n" +
                        "- abdomen dilatat, ac exteriorizat\n" +
                        "- albinele sanatoase le dau afara din stup pe cele bolnave\n" +
                        "Tratament:\n" +
                        "Pentru viroze nu exista tratament specific.\n" +
                        "Se iau masuri generale de dezinfectie.\n" +
                        "Pentru sporirea imunitatii albinelor se poate administra sirop cu vitamina C (un comprimat la 1 litru de sirop).\n" +
                        "\n");
                b1.setVisibility(View.INVISIBLE);
                b2.setVisibility(View.INVISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                i = 0;
                break;


        }
    }

    public void f3(View view){
        TextView t = (TextView) findViewById(R.id.texte);
        Button b1; b1 = (Button) findViewById(R.id.buton1);
        Button b2; b2 = (Button) findViewById(R.id.buton2);
        Button b3; b3 = (Button) findViewById(R.id.buton3);
        Button b4; b4 = (Button) findViewById(R.id.buton4);

        switch (i) {
            default: break;
            case 1:
                t.setText("Bolile care afecteaza atat puietul cat si adultii pot fi micotice sau parazitare. \n" +
                        "La cele micotice se observă in stup celule cu mucegai galben-verde, iar la cele parazitare se pot observa parazitii pe corpul larvelor si albinelor adulte\n" +
                        "Ce observati in stup?");
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
                b1.setText("Mucegai");
                b2.setText("Paraziti");
                b3.setText("");
                b4.setText("");
                i=4;
                break;
            case 6:
                t.setText("Cum arata larvele afectate?");
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
                b1.setText("Cenusii, forma normala");
                b2.setText("Forma de sac cu lichid, galbene sau brune");
                b3.setText("");
                b4.setText("");
                i=8;
                break;

        }
    }

    public void f4(View view){
        TextView t = (TextView) findViewById(R.id.texte);
        Button b1; b1 = (Button) findViewById(R.id.buton1);
        Button b2; b2 = (Button) findViewById(R.id.buton2);
        Button b3; b3 = (Button) findViewById(R.id.buton3);
        Button b4; b4 = (Button) findViewById(R.id.buton4);

        switch (i) {
            default: break;
            case 1:
                t.setText("Diagnosticul probabil este Melanoza.\n" +
                    "Agentul patogen este ciuperca Melanosella mors apis.\n" +
                    "In timpul sezonului activ matca nu depune oua, se misca greu, are abdomenul umflat cu dop de excremente in regiunea anala.\n" +
                    "Tratament:\n" +
                    "Nu exista medicamente.\n" +
                    "Matca bolnava se inlocuieste cu una sanatoasa.\n " +
                    "\n" +
                    "Alt diagnostic cu simptome asemanatoare: Anomalii ale matcii. Tratamentul e identic"); b1.setVisibility(View.INVISIBLE);
                b2.setVisibility(View.INVISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                i=0;
                break;
        }
    }


    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
