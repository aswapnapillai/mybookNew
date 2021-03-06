/** This module is used for routing throughout the application */
import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {LoginComponent} from './login/login.component';
import {RegisterComponent} from './register/register.component';
import {DashboardComponent} from './dashboard/dashboard.component';
import { BookDetailComponent } from './book-detail/book-detail.component'
import { FavoritListComponent } from './favorit-list/favorit-list.component';
import {BookRecommendationComponent} from "./book-recommendations/book-recommendation.component";


const routes: Routes = [

    {path: '', redirectTo: '/login', pathMatch: 'full'},
    {path: 'login', component: LoginComponent},
    {path: 'register', component: RegisterComponent},
    {path: 'dashboard', component: DashboardComponent},
    {path: 'bookDetail', component: BookDetailComponent},
    {path: 'favoriteList', component: FavoritListComponent},
    {path: 'bookReclist', component: BookRecommendationComponent}

];



@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})

export class AppRoute {
}
