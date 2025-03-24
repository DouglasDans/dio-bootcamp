import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, RouterModule } from '@angular/router';
import { dataFake } from '../../data/data-fake';

@Component({
  selector: 'app-post',
  imports: [RouterModule],
  templateUrl: './post.component.html',
  styleUrl: './post.component.scss',
})
export class PostComponent implements OnInit {
  private id: string | null = '0';
  titulo: string = 'Sem Título';
  imgLink: string = '';
  descricao: string = '';

  constructor(private readonly route: ActivatedRoute) {}

  ngOnInit() {
    this.route.paramMap.subscribe((value) => (this.id = value.get('id')));

    this.setValuesToComponent(this.id);
  }

  private setValuesToComponent(id: string | null) {
    const result = dataFake.filter((article) => article.id == id)[0];

    this.titulo = result.title;
    this.descricao = result.description;
    this.imgLink = result.photoCover;
  }
}
