package ya.deneno.drawerlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.GravityCompat
import ya.deneno.drawerlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bc: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bc = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bc.root)

        bc.apply {
            navView.setNavigationItemSelectedListener {
                when(it.itemId) {
                    R.id.item1cat1 -> {
                        Toast.makeText(this@MainActivity, "item11", Toast.LENGTH_SHORT).show()
                        drawer.closeDrawer(GravityCompat.START)
                    }
                    R.id.item2cat1 -> Toast.makeText(this@MainActivity, "item21", Toast.LENGTH_SHORT).show()
                    R.id.item3cat1 -> Toast.makeText(this@MainActivity, "item31", Toast.LENGTH_SHORT).show()
                    R.id.item4cat1 -> Toast.makeText(this@MainActivity, "item41", Toast.LENGTH_SHORT).show()
                    R.id.item1cat2 -> Toast.makeText(this@MainActivity, "item12", Toast.LENGTH_SHORT).show()
                    R.id.item2cat2 -> Toast.makeText(this@MainActivity, "item22", Toast.LENGTH_SHORT).show()
                    R.id.item3cat2 -> Toast.makeText(this@MainActivity, "item32", Toast.LENGTH_SHORT).show()
                    R.id.item4cat2 -> Toast.makeText(this@MainActivity, "item42", Toast.LENGTH_SHORT).show()
                }
                true
            }
            bOpen.setOnClickListener {
                drawer.openDrawer(GravityCompat.START)
            }
        }
    }
}