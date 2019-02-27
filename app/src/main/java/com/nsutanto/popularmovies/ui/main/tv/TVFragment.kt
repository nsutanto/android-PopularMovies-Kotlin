package com.nsutanto.popularmovies.ui.main.tv

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nsutanto.popularmovies.R
import com.nsutanto.popularmovies.ui.base.view.BaseFragment
import com.nsutanto.popularmovies.ui.main.movie.MovieContract
import com.nsutanto.popularmovies.ui.main.movie.MoviePresenter
import javax.inject.Inject

class TVFragment : BaseFragment(), TVContract.View {

    @Inject
    lateinit var presenter: TVPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*
        arguments?.let {
            loanInfo = it.getParcelable(LOAN_INFO)
            borrower = it.getParcelable(BORROWER)
            userFlowData = it.getParcelable(USER_FLOW)

        }
        */
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tv, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onStart() {
        super.onStart()
        presenter.start()
    }

    override fun onStop() {
        super.onStop()
        presenter.stop()
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        //normalFragmentListener = context as NormalFragmentListener
    }
}