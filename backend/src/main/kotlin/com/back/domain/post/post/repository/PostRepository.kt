package com.back.domain.post.post.repository

import com.back.domain.member.member.entity.Member
import com.back.domain.post.post.entity.Post
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface PostRepository : JpaRepository<Post, Long>, PostRepositoryCustom {
    fun findAllByOrderByIdDesc(): List<Post>

    fun findFirstByOrderByIdDesc(): Optional<Post>

    fun findTop1ByAuthorAndPublishedAndTitleOrderByIdDesc(
        author: Member,
        published: Boolean,
        title: String
    ): Optional<Post>

    fun countByPublished(published: Boolean): Long

    fun countByListed(listed: Boolean): Long
}