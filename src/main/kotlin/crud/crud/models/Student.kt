package crud.crud.models

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime

@Entity
class Student {
    @Id
    @GeneratedValue
    var id: Long? = null
    var name: String? = null

    @CreationTimestamp
    var createdAt: LocalDateTime? = null
}