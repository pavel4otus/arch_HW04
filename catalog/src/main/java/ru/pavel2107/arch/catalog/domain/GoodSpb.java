package ru.pavel2107.arch.catalog.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table( name = "goods_spb")
public class GoodSpb extends Good{}
