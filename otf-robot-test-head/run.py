#   Copyright (c) 2019 AT&T Intellectual Property.                             #
#                                                                              #
#   Licensed under the Apache License, Version 2.0 (the "License");            #
#   you may not use this file except in compliance with the License.           #
#   You may obtain a copy of the License at                                    #
#                                                                              #
#       http://www.apache.org/licenses/LICENSE-2.0                             #
#                                                                              #
#   Unless required by applicable law or agreed to in writing, software        #
#   distributed under the License is distributed on an "AS IS" BASIS,          #
#   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   #
#   See the License for the specific language governing permissions and        #
#   limitations under the License.                                             #
################################################################################


from app import create_app

if __name__ == '__main__':
    app = create_app()

    # Set SSL context with the certificate chain and the private RSA key.
    context = ('opt/cert/otf.pem', 'opt/cert/privateKey.pem')
    app.run(
        debug=app.config['DEBUG'],
        host='0.0.0.0', port=5000,
        use_reloader=True,
        ssl_context=context)
    # Run without ssl
	# app.run(debug=app.config['DEBUG'], host='0.0.0.0', use_reloader=True, port=5000)