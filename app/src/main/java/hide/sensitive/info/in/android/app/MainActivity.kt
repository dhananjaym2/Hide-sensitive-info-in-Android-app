package hide.sensitive.info.`in`.android.app

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataTextView.text = getString(R.string.valueFromEnvironmentVariable, BuildConfig.Base_URL)
    }
}
