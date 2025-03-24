import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-post-card',
  imports: [CommonModule, RouterModule],
  templateUrl: './post-card.component.html',
  styleUrl: './post-card.component.scss',
})
export class PostCardComponent {
  @Input() id: string = '';
  @Input() titulo: string = 'Sem Título';
  @Input() descricao: string = '';
  @Input() imgUrl: string | null = null;
}
