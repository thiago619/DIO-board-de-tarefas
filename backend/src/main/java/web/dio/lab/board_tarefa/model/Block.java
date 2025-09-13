package web.dio.lab.board_tarefa.model;

import java.time.ZonedDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="tb_block")
public class Block {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String description;
    private ZonedDateTime blocked_at;
    private ZonedDateTime unblocked_at;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ZonedDateTime getBlocked_at() {
        return blocked_at;
    }

    public void setBlocked_at(ZonedDateTime blocked_at) {
        this.blocked_at = blocked_at;
    }

    public ZonedDateTime getUnblocked_at() {
        return unblocked_at;
    }

    public void setUnblocked_at(ZonedDateTime unblocked_at) {
        this.unblocked_at = unblocked_at;
    }
}
