import logoImage from '../../assets/images/logo.svg';
import { Link } from 'react-router-dom';

export const NavBar = () => {
  return (
        <nav className="navbar navbar-light bg-light">
          <Link to="/" className="navbar-brand" href="#">
            <img src={logoImage} width="50" height="50" className="d-inline-block align-center" alt=""/>
            Cash on Cash
          </Link>
        </nav>
  );
};
