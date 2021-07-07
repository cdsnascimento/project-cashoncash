import { Home } from 'pages/Home';
import { Resumo } from 'pages/Resumo';
import { BrowserRouter, Route, Switch } from 'react-router-dom'

export const Routes = () => {
  return(
    <>
      <BrowserRouter>
        <Switch>
          <Route path="/" exact>
            <Home />
          </Route>
          <Route path="/resumo">
            <Resumo />
          </Route>
        </Switch>
      </BrowserRouter>
    </>
  );
}