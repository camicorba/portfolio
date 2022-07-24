import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { InicioSesionComponent } from './components/inicio-sesion/inicio-sesion.component';
import { PortfolioComponent } from './components/portfolio/portfolio.component';
//aca se importan los componentes

const routes: Routes = [
  {path:'portfolio', component:PortfolioComponent},
  {path:'login', component:InicioSesionComponent},
  {path:'', redirectTo:'portfolio', pathMatch:'full'}
  //Aca van las rutas {path:'', component:pagina1 }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
