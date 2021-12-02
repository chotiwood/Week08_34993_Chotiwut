package umn.ac.id.week08a_34993;

public class MainActivity extends AppCompatActivity {
    private RadioGroup rgJenis;
    private EditText etFileName;
    private EditText etText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rgJenis = (RadioGroup) findViewById(R.id.rgJenis);
        etFileName = (EditText) findViewById(R.id.etNamaFile);
        etText = (EditText) findViewById(R.id.etText);
    }
}
    public void openFile(View view){ }
    public void saveFile(View view){ }
    public void deleteFile(View view) { }
    public void keluarApp(View view){
        finishAffinity();
    }

