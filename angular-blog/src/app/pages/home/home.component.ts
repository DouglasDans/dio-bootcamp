import { Component } from '@angular/core';
import { BannerComponent } from '../../components/banner/banner.component';
import { PostCardComponent } from '../../components/post-card/post-card.component';
import { dataFake } from '../../data/data-fake';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-home',
  imports: [BannerComponent, PostCardComponent, CommonModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss',
})
export class HomeComponent {
  postList = dataFake;
}
