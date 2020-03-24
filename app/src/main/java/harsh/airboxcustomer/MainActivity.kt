package harsh.airboxcustomer

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.airbox.customer.TestView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view: View = TestView(this)

        setContentView(view)
    }
}
