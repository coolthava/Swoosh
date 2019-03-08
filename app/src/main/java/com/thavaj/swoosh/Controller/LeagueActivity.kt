package com.thavaj.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.thavaj.swoosh.Utilities.EXTRA_LEAGUE
import com.thavaj.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedleague =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        womensLeagueBtn.isChecked=false
        coedLeagueBtn.isChecked=false

        selectedleague= "mens"
    }

    fun onWomensClicked(view:View) {
        mensLeagueBtn.isChecked=false
        coedLeagueBtn.isChecked=false

        selectedleague="womens"
    }

    fun onCoedClicked(view: View) {
        mensLeagueBtn.isChecked=false
        womensLeagueBtn.isChecked=false

        selectedleague="co-ed"
    }
    fun leagueNextClicked(view:View) {
        if (selectedleague!="") {
            val skillActivity = Intent(this, SkillActivity::class.java)
                skillActivity.putExtra(EXTRA_LEAGUE,selectedleague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this,"Please select a league",Toast.LENGTH_SHORT).show()
        }

    }
}