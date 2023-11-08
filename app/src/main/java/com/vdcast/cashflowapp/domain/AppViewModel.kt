package com.vdcast.cashflowapp.domain

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject


data class HomeUiState(
//    val bikesList: List<BikeItem> = emptyList(),
//    val selectedBikeId: Int? = null,
//    val bikePartsList: List<BikePartItem> = emptyList(),
//    val selectedBikePartId: Int? = null,
//    val bikeTasksList: List<BikeTaskItem> = emptyList(),
//    val selectedBikeTaskId: Int? = null,
//    val selectedStatus: String = "",
    val salary: Int? = null,
    val totalPassive: Int? = null,
) {

}

@HiltViewModel
class AppViewModel @Inject constructor(
//    private val localRepository: LocalRepository
)    : ViewModel() {

    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState = _uiState.asStateFlow()

}