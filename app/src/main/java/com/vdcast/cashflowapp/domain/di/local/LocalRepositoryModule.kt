package com.vdcast.cashflowapp.domain.di.local

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

//object LocalRepositoryModule {

//    @Module
//    @InstallIn(SingletonComponent::class)
//    object LocalRoomModule {

//        @Singleton
//        @Provides
//        fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
//            return Room.databaseBuilder(context, AppDatabase::class.java, "app_database")
//                .build()
//        }
//
//        @Singleton
//        @Provides
//        fun provideBikeDao(database: AppDatabase): BikeDao = database.bikeDao()
//
//        @Singleton
//        @Provides
//        fun provideBikePartDao(database: AppDatabase): BikePartDao = database.bikePartDao()
//
//        @Singleton
//        @Provides
//        fun provideCurrentWorkDao(database: AppDatabase): BikeTaskDao = database.currentWorkDao()
//
//        @Singleton
//        @Provides
//        fun provideNewPartDao(database: AppDatabase): NewPartDao = database.newPartDao()
//
//
//        @Singleton
//        @Provides
//        fun provideRepository(
//            bikeDao: BikeDao,
//            bikePartDao: BikePartDao,
//            bikeTaskDao: BikeTaskDao,
//            newPartDao: NewPartDao
//        ): LocalRepository = LocalRepositoryImpl(bikeDao, bikePartDao, bikeTaskDao, newPartDao)
//
//    }
//
//}