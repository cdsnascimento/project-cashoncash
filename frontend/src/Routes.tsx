import { AnalCluster } from "pages/AnalCluster";
import { BaseCoC } from "pages/BaseCoC";
import { BaseRoic } from "pages/BaseRoic";
import { Glossario } from 'pages/Glossario';
import { Home } from "pages/Home";
import { ImportData } from 'pages/ImportData';
import { Resumo } from "pages/Resumo";
import { BrowserRouter, Route, Switch } from "react-router-dom";

export const Routes = () => {
  return (
    <>
      <BrowserRouter>
        <Switch>
          <Route path="/" exact component={Home} />
          <Route path="/basecoc" exact component={BaseCoC} />
          <Route path="/baseroic" exact component={BaseRoic} />
          <Route path="/resumo" exact component={Resumo} />
          <Route path="/analcluster" exact component={AnalCluster} />
          <Route path="/glossario" exact component={Glossario} />
          <Route path="/importdata" exact component={ImportData} />
        </Switch>
      </BrowserRouter>
    </>
  );
};
