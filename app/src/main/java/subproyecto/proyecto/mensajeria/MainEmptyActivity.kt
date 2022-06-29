package subproyecto.proyecto.mensajeria

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import subproyecto.proyecto.mensajeria.activities.LoginActivity
import com.google.firebase.auth.FirebaseAuth

// Login And Main Activity Flow sdfgh
class MainEmptyActivity : AppCompatActivity() {

    private val mAuth: FirebaseAuth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (mAuth.currentUser == null) {
            goToActivity<LoginActivity> {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            }
        } else {
            goToActivity<MainActivity> {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            }
        }
        finish()
    }
}
