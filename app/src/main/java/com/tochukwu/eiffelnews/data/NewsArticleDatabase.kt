package com.tochukwu.eiffelnews.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tochukwu.eiffelnews.data.*

@Database(
        entities = [NewsArticle::class, BreakingNews::class, SearchResult::class, SearchQueryRemoteKey::class],
        version = 1
)
abstract class NewsArticleDatabase : RoomDatabase() {

    abstract fun newsArticleDao(): NewsArticleDao

    abstract fun searchQueryRemoteKeyDao(): SearchQueryRemoteKeyDao
}