package com.rekoj134.autosizedemo

import HomeTransactionAdapter
import Transaction
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rekoj134.autosizedemo.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

class MainActivity : AppCompatActivity() {
//    private lateinit var binding: ActivityMainBinding
//    private val listTransaction by lazy { ArrayList<Transaction>() }
//    private var transactionAdapter: HomeTransactionAdapter? = null
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        initData()
//        setupView()
//        handleEvent()
//    }
//
//    private fun handleEvent() {
//        binding.btnAdd.setOnClickListener {
//            startActivity(Intent(this@MainActivity, MainWithouSdpActivity::class.java))
//        }
//
//        binding.btnMore.setOnClickListener {
//            if (!binding.root.isDrawerOpen(Gravity.LEFT)) {
//                binding.root.openDrawer(Gravity.LEFT)
//            }
//        }
//
//        binding.btnChart.setOnClickListener {
//
//        }
//
//        binding.btnCategory.setOnClickListener {
//
//        }
//
//        binding.btnLanguage.setOnClickListener {
//            Toast.makeText(this@MainActivity, "Change language", Toast.LENGTH_SHORT).show()
//        }
//
//        binding.btnRate.setOnClickListener {
//            Toast.makeText(this@MainActivity, "Rate", Toast.LENGTH_SHORT).show()
//        }
//
//        binding.btnShareApp.setOnClickListener {
//            Toast.makeText(this@MainActivity, "Share app", Toast.LENGTH_SHORT).show()
//        }
//
//        binding.btnChangeTheme.setOnClickListener {
//
//        }
//    }
//
////    private fun changeTheme() {
////        if (MyPreference.read(MyPreference.PREF_THEME, R.style.Theme_LightTheme) == LIGHT_THEME) {
////            MyPreference.write(MyPreference.PREF_THEME, DARK_THEME)
////            setTheme(ThemeUtil.getTheme(this@MainActivity))
////            binding.tvBudgetTitle.setTextColor(ThemeUtil.getResColor(this@MainActivity, R.attr.text_color_1))
////            binding.tvBudgetValue.setTextColor(ThemeUtil.getResColor(this@MainActivity, R.attr.text_color_1))
////            binding.tvRemainingBudgetTitle.setTextColor(ThemeUtil.getResColor(this@MainActivity, R.attr.text_color_1))
////            binding.tvRemainingBudgetValue.setTextColor(ThemeUtil.getResColor(this@MainActivity, R.attr.text_color_1))
////            binding.bgBudget.setBackgroundResource(R.drawable.bg_spash)
////            binding.bgBudget.setBackgroundResource(R.drawable.bg_budget)
////            binding.rvTransaction.setBackgroundColor(ThemeUtil.getResColor(this@MainActivity, R.attr.background_color_2))
////
////            // Change theme for navigation drawer
////            binding.navHeader.setBackgroundColor(ThemeUtil.getResColor(this@MainActivity, R.attr.background_color_1))
////            binding.imgLanguage.setColorFilter(ThemeUtil.getResColor(this@MainActivity, R.attr.text_color_1))
////            binding.imgShare.setColorFilter(ThemeUtil.getResColor(this@MainActivity, R.attr.text_color_1))
////            binding.imgRate.setColorFilter(ThemeUtil.getResColor(this@MainActivity, R.attr.text_color_1))
////            binding.tvLanguage.setTextColor(ThemeUtil.getResColor(this@MainActivity, R.attr.text_color_1))
////            binding.tvShare.setTextColor(ThemeUtil.getResColor(this@MainActivity, R.attr.text_color_1))
////            binding.tvRate.setTextColor(ThemeUtil.getResColor(this@MainActivity, R.attr.text_color_1))
////
////            // Change theme for bottom nav
////            binding.bottomNav.setBackgroundColor(ThemeUtil.getResColor(this@MainActivity, R.attr.background_color_1))
////            binding.btnChart.setBackgroundResource(R.drawable.bg_spash)
////            binding.btnChart.setBackgroundResource(R.drawable.bg_btn_bottom_nav)
////            binding.btnCategory.setBackgroundResource(R.drawable.bg_spash)
////            binding.btnCategory.setBackgroundResource(R.drawable.bg_btn_bottom_nav)
////            binding.btnCategory.setColorFilter(ThemeUtil.getResColor(this@MainActivity, R.attr.text_color_1))
////            binding.btnChart.setColorFilter(ThemeUtil.getResColor(this@MainActivity, R.attr.text_color_1))
////
////            // Change theme for recycler view
////            transactionAdapter?.refreshRecyclerView()
////
////            window.navigationBarColor = ThemeUtil.getResColor(this@MainActivity, R.attr.background_color_1)
////        } else {
////            MyPreference.write(MyPreference.PREF_THEME, LIGHT_THEME)
////            setTheme(ThemeUtil.getTheme(this@MainActivity))
////            binding.tvBudgetTitle.setTextColor(ThemeUtil.getResColor(this@MainActivity, R.attr.text_color_1))
////            binding.tvBudgetValue.setTextColor(ThemeUtil.getResColor(this@MainActivity, R.attr.text_color_1))
////            binding.tvRemainingBudgetTitle.setTextColor(ThemeUtil.getResColor(this@MainActivity, R.attr.text_color_1))
////            binding.tvRemainingBudgetValue.setTextColor(ThemeUtil.getResColor(this@MainActivity, R.attr.text_color_1))
////            binding.bgBudget.setBackgroundResource(R.drawable.bg_spash)
////            binding.bgBudget.setBackgroundResource(R.drawable.bg_budget)
////            binding.rvTransaction.setBackgroundColor(ThemeUtil.getResColor(this@MainActivity, R.attr.background_color_2))
////
////            // Change theme for navigation drawer
////            binding.navHeader.setBackgroundColor(ThemeUtil.getResColor(this@MainActivity, R.attr.background_color_1))
////            binding.imgLanguage.setColorFilter(ThemeUtil.getResColor(this@MainActivity, R.attr.text_color_1))
////            binding.imgShare.setColorFilter(ThemeUtil.getResColor(this@MainActivity, R.attr.text_color_1))
////            binding.imgRate.setColorFilter(ThemeUtil.getResColor(this@MainActivity, R.attr.text_color_1))
////            binding.tvLanguage.setTextColor(ThemeUtil.getResColor(this@MainActivity, R.attr.text_color_1))
////            binding.tvShare.setTextColor(ThemeUtil.getResColor(this@MainActivity, R.attr.text_color_1))
////            binding.tvRate.setTextColor(ThemeUtil.getResColor(this@MainActivity, R.attr.text_color_1))
////
////            // Change theme for bottom nav
////            binding.bottomNav.setBackgroundColor(ThemeUtil.getResColor(this@MainActivity, R.attr.background_color_1))
////            binding.btnChart.setBackgroundResource(R.drawable.bg_spash)
////            binding.btnChart.setBackgroundResource(R.drawable.bg_btn_bottom_nav)
////            binding.btnCategory.setBackgroundResource(R.drawable.bg_spash)
////            binding.btnCategory.setBackgroundResource(R.drawable.bg_btn_bottom_nav)
////            binding.btnCategory.setColorFilter(ThemeUtil.getResColor(this@MainActivity, R.attr.text_color_1))
////            binding.btnChart.setColorFilter(ThemeUtil.getResColor(this@MainActivity, R.attr.text_color_1))
////
////            // Change theme for recycler view
////            transactionAdapter?.refreshRecyclerView()
////
////            window.navigationBarColor = ThemeUtil.getResColor(this@MainActivity, R.attr.background_color_1)
////        }
////
////        // Can change theme by set MyPreference.write(MyPreference.PREF_THEME, LIGHT_THEME) and call recreate() to make things change
////    }
//
//    private fun initData() {
//        val time1 = System.currentTimeMillis()
//        listTransaction.add(Transaction(0, "Clothing", 3000000.0, ICON_CATEGORY_1, "#33AA7F", time1, "", TYPE_EXPENSE))
//        listTransaction.add(Transaction(1, "Eating", 4000000.0, ICON_CATEGORY_2, "#F5CF47", time1, "", TYPE_EXPENSE))
//        listTransaction.add(Transaction(2, "Car", 5000000.0, ICON_CATEGORY_1, "#F34D4D", time1, "", TYPE_EXPENSE))
//        listTransaction.add(Transaction(3, "Car", 2000000.0, ICON_CATEGORY_1, "#F34D4D", time1, "", TYPE_INCOME))
//        listTransaction.add(Transaction(4, "Car", 5000000.0, ICON_CATEGORY_1, "#F34D4D", time1, "", TYPE_EXPENSE))
//        listTransaction.add(Transaction(5, "Car", 6000000.0, ICON_CATEGORY_1, "#F34D4D", time1, "", TYPE_INCOME))
//
//        val time2 = System.currentTimeMillis() - 96400000
//        listTransaction.add(Transaction(6, "Eating", 6000000.0, ICON_CATEGORY_2, "#F5CF47", time2, "", TYPE_EXPENSE))
//        listTransaction.add(Transaction(7, "Eating", 7000000.0, ICON_CATEGORY_2, "#F5CF47", time2, "", TYPE_EXPENSE))
//
//        val time3 = System.currentTimeMillis() - 196400000
//        listTransaction.add(Transaction(8, "Eating", 8000000.0, ICON_CATEGORY_2, "#F5CF47", time3, "", TYPE_EXPENSE))
//
//        val time4 = System.currentTimeMillis() - 296400000
//        listTransaction.add(Transaction(9, "Car", 9000000.0, ICON_CATEGORY_1, "#F34D4D", time4, "", TYPE_EXPENSE))
//        listTransaction.add(Transaction(10, "Car", 6000000.0, ICON_CATEGORY_1, "#F34D4D", time1, "", TYPE_INCOME))
//
//        transactionAdapter = HomeTransactionAdapter(this@MainActivity)
//    }
//
//    @SuppressLint("ClickableViewAccessibility")
//    private fun setupView() {
//        binding.tvTitleTop.text = getTopTitle()
//
//        binding.rvTransaction.adapter = transactionAdapter
//
//        listTransaction.sortWith(compareByDescending {
//            it.dateTime
//        })
//        transactionAdapter?.setListTransaction(listTransaction)
//        transactionAdapter?.notifyDataSetChanged()
//
////        binding.rvTransaction.setOnTouchListener(TranslateAnimationUtil(this@MainActivity, binding.bottomNav, binding.btnAdd))
//    }
//
//    private fun getTopTitle() : String {
//        val curDate: Date = Calendar.getInstance().time
//        val dateFormatter= SimpleDateFormat("yyyy-MM", Locale.getDefault())
//        val formattedDate = dateFormatter.format(curDate)
//        return "$formattedDate Balance"
//    }
}