package com.example.firestore.presentation.user

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.firestore.R
import com.example.firestore.databinding.ActivityUserBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class UserActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserBinding
    private lateinit var viewModel: UserViewModel

    @Inject
    private lateinit var factory: UserViewModelFactory
    @Inject
    private lateinit var userAdapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_user)
        viewModel = ViewModelProvider(this, factory).get(UserViewModel::class.java)

        initRecycler()

    }

    private fun initRecycler() {
        binding.recyclerView.apply {
            adapter = userAdapter
            layoutManager = LinearLayoutManager(binding.recyclerView.context)
        }

    }
}