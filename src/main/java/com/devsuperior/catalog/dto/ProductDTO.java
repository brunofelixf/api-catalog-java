package com.devsuperior.catalog.dto;

import com.devsuperior.catalog.entities.Category;
import com.devsuperior.catalog.entities.Product;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ProductDTO implements Serializable {
    private Long id;

    @Size(min = 5, max = 60, message = "O nome deve ter entre 5 e 60 caracteres")
    @NotBlank(message = "Nome é obrigatório")
    private String name;

    @NotBlank(message = "Descrição é obrigatório")
    private String description;

    @Positive(message = "Preço deve ser positivo")
    private Double price;
    private String img_url;

    @PastOrPresent(message = "A data não pode ser futura")
    private Instant date;

    private List<CategoryDTO> categories = new ArrayList<>();

    public ProductDTO() {}

    public ProductDTO(Long id, String name, String description, Double price, String img_url, Instant date) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.img_url = img_url;
        this.date = date;
    }
    public ProductDTO(Product entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.description = entity.getDescription();
        this.price = entity.getPrice();
        this.img_url = entity.getImgURL();
        this.date = entity.getDate();
    }

    public ProductDTO(Product entity, Set<Category> categories) {
        this(entity);
        categories.forEach(cat -> this.categories.add(new CategoryDTO(cat)));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public List<CategoryDTO> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryDTO> categories) {
        this.categories = categories;
    }
}
