.class public final Lio/github/jan/supabase/auth/a;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Luu;


# static fields
.field public static final synthetic q:I


# instance fields
.field public final b:Lj77;

.field public final c:Lwu;

.field public final d:Lcf4;

.field public final e:Ld37;

.field public final f:Lxw5;

.field public final g:Lpr6;

.field public final h:Lig0;

.field public final i:Lcf4;

.field public final j:Lkg5;

.field public final k:Law;

.field public final l:Li77;

.field public final m:Law;

.field public n:Lh27;

.field public o:Lan6;

.field public final p:Lt77;


# direct methods
.method public constructor <init>(Lj77;Lwu;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lio/github/jan/supabase/auth/a;->b:Lj77;

    .line 11
    .line 12
    iput-object p2, p0, Lio/github/jan/supabase/auth/a;->c:Lwu;

    .line 13
    .line 14
    const-string v1, "Supabase-Auth"

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-static {p1, v1, v3, v3}, Lt75;->j(Lj77;Ljava/lang/String;Lub4;Lvr2;)Lcf4;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, p0, Lio/github/jan/supabase/auth/a;->d:Lcf4;

    .line 22
    .line 23
    sget-object v1, Ljn6;->a:Ljn6;

    .line 24
    .line 25
    invoke-static {v1}, Le37;->a(Ljava/lang/Object;)Ld37;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, p0, Lio/github/jan/supabase/auth/a;->e:Ld37;

    .line 30
    .line 31
    invoke-static {v1}, Lgr8;->t(Ld37;)Lxw5;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iput-object v1, p0, Lio/github/jan/supabase/auth/a;->f:Lxw5;

    .line 36
    .line 37
    const/4 v1, 0x6

    .line 38
    invoke-static {v3, v1}, Lqr6;->a(Lvc0;I)Lpr6;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iput-object v1, p0, Lio/github/jan/supabase/auth/a;->g:Lpr6;

    .line 43
    .line 44
    move-object v9, p1

    .line 45
    check-cast v9, Lm77;

    .line 46
    .line 47
    iget-object v1, v9, Lm77;->e:Lh81;

    .line 48
    .line 49
    invoke-static {}, Lb85;->d()Lw77;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-static {v1, v4}, Lrc9;->D0(Lc81;Le81;)Le81;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v1}, Lgl0;->E(Le81;)Lig0;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iput-object v1, p0, Lio/github/jan/supabase/auth/a;->h:Lig0;

    .line 65
    .line 66
    sget v1, Lgk5;->a:I

    .line 67
    .line 68
    new-instance v1, Lcf4;

    .line 69
    .line 70
    iget-object v4, v9, Lm77;->c:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v4}, Lub5;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    const-string v6, "-session"

    .line 77
    .line 78
    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    const/16 v6, 0x10

    .line 83
    .line 84
    invoke-direct {v1, v5, v6}, Lcf4;-><init>(Ljava/lang/String;I)V

    .line 85
    .line 86
    .line 87
    iput-object v1, p0, Lio/github/jan/supabase/auth/a;->i:Lcf4;

    .line 88
    .line 89
    new-instance v1, Lkg5;

    .line 90
    .line 91
    invoke-static {v4}, Lub5;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    const-string v5, "-supabase_code_verifier"

    .line 96
    .line 97
    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-direct {v1, v4}, Lkg5;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    iput-object v1, p0, Lio/github/jan/supabase/auth/a;->j:Lkg5;

    .line 105
    .line 106
    const/16 v1, 0xa

    .line 107
    .line 108
    invoke-static {p1, p0, v3, v3, v1}, Lsg3;->g(Lj77;Lqe4;Lay5;Ljava/lang/Integer;I)Law;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    iput-object v10, p0, Lio/github/jan/supabase/auth/a;->k:Law;

    .line 113
    .line 114
    new-instance v0, Lno6;

    .line 115
    .line 116
    const/4 v7, 0x0

    .line 117
    const/16 v8, 0x1b

    .line 118
    .line 119
    const/4 v1, 0x1

    .line 120
    const-class v3, Lqe4;

    .line 121
    .line 122
    const-string v4, "resolveUrl"

    .line 123
    .line 124
    const-string v5, "resolveUrl(Ljava/lang/String;)Ljava/lang/String;"

    .line 125
    .line 126
    const/4 v6, 0x0

    .line 127
    move-object v2, p0

    .line 128
    invoke-direct/range {v0 .. v8}, Lno6;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 129
    .line 130
    .line 131
    move-object v11, v0

    .line 132
    new-instance v0, Lyv;

    .line 133
    .line 134
    const/16 v8, 0xf

    .line 135
    .line 136
    const/4 v1, 0x2

    .line 137
    const-class v3, Lqe4;

    .line 138
    .line 139
    const-string v4, "parseErrorResponse"

    .line 140
    .line 141
    const-string v5, "parseErrorResponse(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 142
    .line 143
    invoke-direct/range {v0 .. v8}, Lyv;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 144
    .line 145
    .line 146
    new-instance v1, Li77;

    .line 147
    .line 148
    iget-object v3, v9, Lm77;->h:Ltx3;

    .line 149
    .line 150
    invoke-direct {v1, v11, v0, v3}, Li77;-><init>(Lvr2;Lgs2;Ln77;)V

    .line 151
    .line 152
    .line 153
    iput-object v1, p0, Lio/github/jan/supabase/auth/a;->l:Li77;

    .line 154
    .line 155
    iput-object v10, p0, Lio/github/jan/supabase/auth/a;->m:Law;

    .line 156
    .line 157
    const-string v0, "factors"

    .line 158
    .line 159
    invoke-virtual {v10, v0}, Law;->d(Ljava/lang/String;)Law;

    .line 160
    .line 161
    .line 162
    iget-object v0, v9, Lm77;->b:Lt77;

    .line 163
    .line 164
    iput-object v0, p0, Lio/github/jan/supabase/auth/a;->p:Lt77;

    .line 165
    .line 166
    return-void
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
.end method

.method public static final l(Lio/github/jan/supabase/auth/a;Lio/github/jan/supabase/auth/user/UserSession;ZLh61;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, Lcv;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcv;

    .line 7
    .line 8
    iget v1, v0, Lcv;->D:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcv;->D:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lcv;

    .line 22
    .line 23
    invoke-direct {v0, p0, p3}, Lcv;-><init>(Lio/github/jan/supabase/auth/a;Lh61;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p3, v6, Lcv;->B:Ljava/lang/Object;

    .line 28
    .line 29
    iget v0, v6, Lcv;->D:I

    .line 30
    .line 31
    sget-object v7, Lvs7;->a:Lvs7;

    .line 32
    .line 33
    const/4 v1, 0x2

    .line 34
    const/4 v2, 0x1

    .line 35
    const/4 v3, 0x0

    .line 36
    sget-object v8, Lp81;->w:Lp81;

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    if-eq v0, v2, :cond_2

    .line 41
    .line 42
    if-ne v0, v1, :cond_1

    .line 43
    .line 44
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_5

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v3

    .line 54
    :cond_2
    iget-boolean p2, v6, Lcv;->A:Z

    .line 55
    .line 56
    iget-object p1, v6, Lcv;->z:Lio/github/jan/supabase/auth/user/UserSession;

    .line 57
    .line 58
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object p3, p0, Lio/github/jan/supabase/auth/a;->d:Lcf4;

    .line 66
    .line 67
    iget-object v0, p3, Lcf4;->z:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Lms3;

    .line 70
    .line 71
    iget-object p3, p3, Lcf4;->y:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p3, Ljava/lang/String;

    .line 74
    .line 75
    sget-object v4, Lub4;->w:Lub4;

    .line 76
    .line 77
    invoke-virtual {v0, v4}, Lms3;->a(Lub4;)Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-eqz v5, :cond_4

    .line 82
    .line 83
    const-string v5, "Session expired. Refreshing session..."

    .line 84
    .line 85
    invoke-virtual {v0, v4, p3, v3, v5}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_4
    invoke-virtual {p1}, Lio/github/jan/supabase/auth/user/UserSession;->getRefreshToken()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p3

    .line 92
    iput-object p1, v6, Lcv;->z:Lio/github/jan/supabase/auth/user/UserSession;

    .line 93
    .line 94
    iput-boolean p2, v6, Lcv;->A:Z

    .line 95
    .line 96
    iput v2, v6, Lcv;->D:I

    .line 97
    .line 98
    invoke-virtual {p0, p3, v6}, Lio/github/jan/supabase/auth/a;->t(Ljava/lang/String;Lh61;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    if-ne p3, v8, :cond_5

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_5
    :goto_2
    move-object v2, p3

    .line 106
    check-cast v2, Lio/github/jan/supabase/auth/user/UserSession;

    .line 107
    .line 108
    new-instance v4, Lcn6;

    .line 109
    .line 110
    invoke-direct {v4, p1}, Lcn6;-><init>(Lio/github/jan/supabase/auth/user/UserSession;)V

    .line 111
    .line 112
    .line 113
    iput-object v3, v6, Lcv;->z:Lio/github/jan/supabase/auth/user/UserSession;

    .line 114
    .line 115
    iput-boolean p2, v6, Lcv;->A:Z

    .line 116
    .line 117
    iput v1, v6, Lcv;->D:I

    .line 118
    .line 119
    const/4 v5, 0x0

    .line 120
    move-object v1, p0

    .line 121
    move v3, p2

    .line 122
    invoke-virtual/range {v1 .. v6}, Lio/github/jan/supabase/auth/a;->o(Lio/github/jan/supabase/auth/user/UserSession;ZLhn6;ZLh61;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    if-ne p0, v8, :cond_6

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_6
    move-object p0, v7

    .line 130
    :goto_3
    if-ne p0, v8, :cond_7

    .line 131
    .line 132
    :goto_4
    return-object v8

    .line 133
    :cond_7
    :goto_5
    return-object v7
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method

.method public static final m(Lio/github/jan/supabase/auth/a;Lxc;Lzc;Lgv;Lh61;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lio/github/jan/supabase/auth/a;->d:Lcf4;

    .line 2
    .line 3
    iget-object v1, p0, Lio/github/jan/supabase/auth/a;->c:Lwu;

    .line 4
    .line 5
    instance-of v2, p4, Lnv;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, p4

    .line 10
    check-cast v2, Lnv;

    .line 11
    .line 12
    iget v3, v2, Lnv;->D:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lnv;->D:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lnv;

    .line 25
    .line 26
    invoke-direct {v2, p0, p4}, Lnv;-><init>(Lio/github/jan/supabase/auth/a;Lh61;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p4, v2, Lnv;->B:Ljava/lang/Object;

    .line 30
    .line 31
    iget v3, v2, Lnv;->D:I

    .line 32
    .line 33
    sget-object v4, Lvs7;->a:Lvs7;

    .line 34
    .line 35
    sget-object v5, Lp81;->w:Lp81;

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    packed-switch v3, :pswitch_data_0

    .line 39
    .line 40
    .line 41
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v6

    .line 47
    :pswitch_0
    invoke-static {p4}, Lo85;->q(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_a

    .line 51
    .line 52
    :pswitch_1
    iget-object p0, v2, Lnv;->z:Lvr2;

    .line 53
    .line 54
    invoke-static {p4}, Lo85;->q(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_4

    .line 58
    .line 59
    :pswitch_2
    iget-object p0, v2, Lnv;->z:Lvr2;

    .line 60
    .line 61
    invoke-static {p4}, Lo85;->q(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_2

    .line 65
    .line 66
    :pswitch_3
    iget-object p0, v2, Lnv;->z:Lvr2;

    .line 67
    .line 68
    invoke-static {p4}, Lo85;->q(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto/16 :goto_8

    .line 72
    .line 73
    :pswitch_4
    iget-object p0, v2, Lnv;->z:Lvr2;

    .line 74
    .line 75
    invoke-static {p4}, Lo85;->q(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    goto/16 :goto_6

    .line 79
    .line 80
    :pswitch_5
    iget-object p3, v2, Lnv;->A:Lgv;

    .line 81
    .line 82
    iget-object p2, v2, Lnv;->z:Lvr2;

    .line 83
    .line 84
    :try_start_0
    invoke-static {p4}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_0
    .catch Lio/github/jan/supabase/exceptions/RestException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    .line 86
    .line 87
    goto/16 :goto_a

    .line 88
    .line 89
    :catch_0
    move-exception p0

    .line 90
    goto :goto_1

    .line 91
    :catch_1
    move-exception p1

    .line 92
    goto/16 :goto_5

    .line 93
    .line 94
    :pswitch_6
    invoke-static {p4}, Lo85;->q(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :try_start_1
    iput-object p2, v2, Lnv;->z:Lvr2;

    .line 98
    .line 99
    iput-object p3, v2, Lnv;->A:Lgv;

    .line 100
    .line 101
    const/4 p4, 0x1

    .line 102
    iput p4, v2, Lnv;->D:I

    .line 103
    .line 104
    invoke-virtual {p1, v2}, Lxc;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0
    :try_end_1
    .catch Lio/github/jan/supabase/exceptions/RestException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 108
    if-ne p0, v5, :cond_b

    .line 109
    .line 110
    goto/16 :goto_9

    .line 111
    .line 112
    :goto_1
    iget-object p1, v2, Lh61;->x:Le81;

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-static {p1}, Lr16;->x(Le81;)V

    .line 118
    .line 119
    .line 120
    iget-object p1, v0, Lcf4;->z:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast p1, Lms3;

    .line 123
    .line 124
    iget-object p4, v0, Lcf4;->y:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast p4, Ljava/lang/String;

    .line 127
    .line 128
    sget-object v0, Lub4;->w:Lub4;

    .line 129
    .line 130
    invoke-virtual {p1, v0}, Lms3;->a(Lub4;)Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    if-eqz v3, :cond_1

    .line 135
    .line 136
    new-instance v3, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    const-string v7, "Couldn\'t reach Supabase. Either the address doesn\'t exist or the network might not be on. Retrying in "

    .line 139
    .line 140
    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    iget-wide v7, v1, Lwu;->u:J

    .line 144
    .line 145
    invoke-static {v7, v8}, Lu02;->k(J)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v7, "..."

    .line 153
    .line 154
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-virtual {p1, v0, p4, p0, v3}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :cond_1
    new-instance p1, Lh26;

    .line 165
    .line 166
    invoke-direct {p1, p0}, Lh26;-><init>(Ljava/lang/Exception;)V

    .line 167
    .line 168
    .line 169
    iput-object p2, v2, Lnv;->z:Lvr2;

    .line 170
    .line 171
    iput-object v6, v2, Lnv;->A:Lgv;

    .line 172
    .line 173
    const/4 p0, 0x6

    .line 174
    iput p0, v2, Lnv;->D:I

    .line 175
    .line 176
    invoke-interface {p3, p1, v2}, Lgs2;->H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    if-ne v4, v5, :cond_2

    .line 180
    .line 181
    goto/16 :goto_9

    .line 182
    .line 183
    :cond_2
    move-object p0, p2

    .line 184
    :goto_2
    iget-wide p1, v1, Lwu;->u:J

    .line 185
    .line 186
    iput-object p0, v2, Lnv;->z:Lvr2;

    .line 187
    .line 188
    iput-object v6, v2, Lnv;->A:Lgv;

    .line 189
    .line 190
    const/4 p3, 0x7

    .line 191
    iput p3, v2, Lnv;->D:I

    .line 192
    .line 193
    invoke-static {p1, p2}, Lt49;->d0(J)J

    .line 194
    .line 195
    .line 196
    move-result-wide p1

    .line 197
    invoke-static {p1, p2, v2}, Lt49;->G(JLf61;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    if-ne p1, v5, :cond_3

    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_3
    move-object p1, v4

    .line 205
    :goto_3
    if-ne p1, v5, :cond_4

    .line 206
    .line 207
    goto/16 :goto_9

    .line 208
    .line 209
    :cond_4
    :goto_4
    iput-object v6, v2, Lnv;->z:Lvr2;

    .line 210
    .line 211
    iput-object v6, v2, Lnv;->A:Lgv;

    .line 212
    .line 213
    const/16 p1, 0x8

    .line 214
    .line 215
    iput p1, v2, Lnv;->D:I

    .line 216
    .line 217
    invoke-interface {p0, v2}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    if-ne p0, v5, :cond_b

    .line 222
    .line 223
    goto/16 :goto_9

    .line 224
    .line 225
    :goto_5
    sget-object p4, Lqv;->b:Ljava/util/List;

    .line 226
    .line 227
    new-instance v3, Ljava/lang/Integer;

    .line 228
    .line 229
    iget v7, p1, Lio/github/jan/supabase/exceptions/RestException;->w:I

    .line 230
    .line 231
    invoke-direct {v3, v7}, Ljava/lang/Integer;-><init>(I)V

    .line 232
    .line 233
    .line 234
    invoke-interface {p4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result p4

    .line 238
    sget-object v3, Lub4;->z:Lub4;

    .line 239
    .line 240
    if-eqz p4, :cond_9

    .line 241
    .line 242
    iget-object p0, v0, Lcf4;->z:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast p0, Lms3;

    .line 245
    .line 246
    iget-object p4, v0, Lcf4;->y:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast p4, Ljava/lang/String;

    .line 249
    .line 250
    invoke-virtual {p0, v3}, Lms3;->a(Lub4;)Z

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    if-eqz v0, :cond_5

    .line 255
    .line 256
    new-instance v0, Ljava/lang/StringBuilder;

    .line 257
    .line 258
    const-string v8, "Couldn\'t refresh session due to an internal server error. Retrying in "

    .line 259
    .line 260
    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    iget-wide v8, v1, Lwu;->u:J

    .line 264
    .line 265
    invoke-static {v8, v9}, Lu02;->k(J)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v8

    .line 269
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    const-string v8, " (Status code "

    .line 273
    .line 274
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    const-string v7, ")..."

    .line 281
    .line 282
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-virtual {p0, v3, p4, p1, v0}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    :cond_5
    new-instance p0, Lg26;

    .line 293
    .line 294
    invoke-direct {p0, p1}, Lg26;-><init>(Lio/github/jan/supabase/exceptions/RestException;)V

    .line 295
    .line 296
    .line 297
    iput-object p2, v2, Lnv;->z:Lvr2;

    .line 298
    .line 299
    iput-object v6, v2, Lnv;->A:Lgv;

    .line 300
    .line 301
    const/4 p1, 0x2

    .line 302
    iput p1, v2, Lnv;->D:I

    .line 303
    .line 304
    invoke-interface {p3, p0, v2}, Lgs2;->H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    if-ne v4, v5, :cond_6

    .line 308
    .line 309
    goto :goto_9

    .line 310
    :cond_6
    move-object p0, p2

    .line 311
    :goto_6
    iget-wide p1, v1, Lwu;->u:J

    .line 312
    .line 313
    iput-object p0, v2, Lnv;->z:Lvr2;

    .line 314
    .line 315
    iput-object v6, v2, Lnv;->A:Lgv;

    .line 316
    .line 317
    const/4 p3, 0x3

    .line 318
    iput p3, v2, Lnv;->D:I

    .line 319
    .line 320
    invoke-static {p1, p2}, Lt49;->d0(J)J

    .line 321
    .line 322
    .line 323
    move-result-wide p1

    .line 324
    invoke-static {p1, p2, v2}, Lt49;->G(JLf61;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    if-ne p1, v5, :cond_7

    .line 329
    .line 330
    goto :goto_7

    .line 331
    :cond_7
    move-object p1, v4

    .line 332
    :goto_7
    if-ne p1, v5, :cond_8

    .line 333
    .line 334
    goto :goto_9

    .line 335
    :cond_8
    :goto_8
    iput-object v6, v2, Lnv;->z:Lvr2;

    .line 336
    .line 337
    iput-object v6, v2, Lnv;->A:Lgv;

    .line 338
    .line 339
    const/4 p1, 0x4

    .line 340
    iput p1, v2, Lnv;->D:I

    .line 341
    .line 342
    invoke-interface {p0, v2}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object p0

    .line 346
    if-ne p0, v5, :cond_b

    .line 347
    .line 348
    goto :goto_9

    .line 349
    :cond_9
    iget-object p2, v0, Lcf4;->z:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast p2, Lms3;

    .line 352
    .line 353
    iget-object p3, v0, Lcf4;->y:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast p3, Ljava/lang/String;

    .line 356
    .line 357
    invoke-virtual {p2, v3}, Lms3;->a(Lub4;)Z

    .line 358
    .line 359
    .line 360
    move-result p4

    .line 361
    if-eqz p4, :cond_a

    .line 362
    .line 363
    const-string p4, "Couldn\'t refresh session. The refresh token may have been revoked. Clearing session (Status code "

    .line 364
    .line 365
    const-string v0, ")... "

    .line 366
    .line 367
    invoke-static {v7, p4, v0}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object p4

    .line 371
    invoke-virtual {p2, v3, p3, p1, p4}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    :cond_a
    iput-object v6, v2, Lnv;->z:Lvr2;

    .line 375
    .line 376
    iput-object v6, v2, Lnv;->A:Lgv;

    .line 377
    .line 378
    const/4 p1, 0x5

    .line 379
    iput p1, v2, Lnv;->D:I

    .line 380
    .line 381
    invoke-virtual {p0, v2}, Lio/github/jan/supabase/auth/a;->n(Lh61;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object p0

    .line 385
    if-ne p0, v5, :cond_b

    .line 386
    .line 387
    :goto_9
    move-object v4, v5

    .line 388
    :cond_b
    :goto_a
    return-object v4

    .line 389
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/a;->c:Lwu;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final e(Lyl1;Lf61;)Ljava/io/Serializable;
    .locals 11

    .line 1
    instance-of v0, p2, Lfv;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lfv;

    .line 7
    .line 8
    iget v1, v0, Lfv;->D:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lfv;->D:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lfv;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lfv;-><init>(Lio/github/jan/supabase/auth/a;Lf61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lfv;->B:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lfv;->D:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    iget-object p1, v0, Lfv;->A:Lj77;

    .line 36
    .line 37
    iget-object v0, v0, Lfv;->z:Lyl1;

    .line 38
    .line 39
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object v10, v0

    .line 43
    move-object v0, p2

    .line 44
    move-object p2, v10

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v3

    .line 52
    :cond_2
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput-object p1, v0, Lfv;->z:Lyl1;

    .line 56
    .line 57
    iget-object p2, p0, Lio/github/jan/supabase/auth/a;->b:Lj77;

    .line 58
    .line 59
    iput-object p2, v0, Lfv;->A:Lj77;

    .line 60
    .line 61
    iput v2, v0, Lfv;->D:I

    .line 62
    .line 63
    sget-object v1, Lmo0;->a:Ljava/nio/charset/Charset;

    .line 64
    .line 65
    invoke-static {p1, v1, v0}, Lh49;->q(Lyl1;Ljava/nio/charset/Charset;Lh61;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sget-object v1, Lp81;->w:Lp81;

    .line 70
    .line 71
    if-ne v0, v1, :cond_3

    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_3
    move-object v10, p2

    .line 75
    move-object p2, p1

    .line 76
    move-object p1, v10

    .line 77
    :goto_1
    move-object v1, v0

    .line 78
    check-cast v1, Ljava/lang/String;

    .line 79
    .line 80
    :try_start_0
    sget-object v0, Ll18;->a:Lkm3;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    sget-object v2, Lio/github/jan/supabase/auth/GoTrueErrorResponse;->Companion:Lio/github/jan/supabase/auth/b;

    .line 86
    .line 87
    invoke-virtual {v2}, Lio/github/jan/supabase/auth/b;->serializer()Lzr3;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    check-cast v2, Lzr3;

    .line 92
    .line 93
    invoke-virtual {v0, v2, v1}, Lpl3;->b(Lzr3;Ljava/lang/String;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1
    :try_end_0
    .catch Lkotlinx/serialization/SerializationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    goto :goto_2

    .line 98
    :catch_0
    move-exception v0

    .line 99
    check-cast p1, Lm77;

    .line 100
    .line 101
    iget-object p1, p1, Lm77;->f:Lcf4;

    .line 102
    .line 103
    iget-object v2, p1, Lcf4;->z:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v2, Lms3;

    .line 106
    .line 107
    iget-object p1, p1, Lcf4;->y:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast p1, Ljava/lang/String;

    .line 110
    .line 111
    sget-object v4, Lub4;->x:Lub4;

    .line 112
    .line 113
    invoke-virtual {v2, v4}, Lms3;->a(Lub4;)Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_4

    .line 118
    .line 119
    new-instance v5, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    const-string v6, "Could not decode "

    .line 122
    .line 123
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    const/16 v6, 0xc8

    .line 127
    .line 128
    invoke-static {v6, v1}, Ld57;->i1(ILjava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string v1, " as "

    .line 136
    .line 137
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-class v1, Lio/github/jan/supabase/auth/GoTrueErrorResponse;

    .line 141
    .line 142
    sget-object v6, Lb26;->a:Lc26;

    .line 143
    .line 144
    invoke-virtual {v6, v1}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-interface {v1}, Lgq3;->A()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    const/16 v1, 0x2e

    .line 156
    .line 157
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-virtual {v2, v4, p1, v0, v1}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    :cond_4
    move-object p1, v3

    .line 168
    :goto_2
    check-cast p1, Lio/github/jan/supabase/auth/GoTrueErrorResponse;

    .line 169
    .line 170
    if-nez p1, :cond_5

    .line 171
    .line 172
    new-instance v4, Lio/github/jan/supabase/auth/GoTrueErrorResponse;

    .line 173
    .line 174
    const/4 v8, 0x4

    .line 175
    const/4 v9, 0x0

    .line 176
    const-string v5, "Unknown error"

    .line 177
    .line 178
    const-string v6, ""

    .line 179
    .line 180
    const/4 v7, 0x0

    .line 181
    invoke-direct/range {v4 .. v9}, Lio/github/jan/supabase/auth/GoTrueErrorResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/GoTrueErrorResponse$WeakPassword;ILhl1;)V

    .line 182
    .line 183
    .line 184
    move-object p1, v4

    .line 185
    :cond_5
    invoke-virtual {p1}, Lio/github/jan/supabase/auth/GoTrueErrorResponse;->getError()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    const-string v1, "weak_password"

    .line 190
    .line 191
    invoke-static {v0, v1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    if-eqz v2, :cond_7

    .line 196
    .line 197
    new-instance p0, Lio/github/jan/supabase/auth/exception/AuthWeakPasswordException;

    .line 198
    .line 199
    invoke-virtual {p1}, Lio/github/jan/supabase/auth/GoTrueErrorResponse;->getDescription()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {p1}, Lio/github/jan/supabase/auth/GoTrueErrorResponse;->getWeakPassword()Lio/github/jan/supabase/auth/GoTrueErrorResponse$WeakPassword;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    if-eqz v2, :cond_6

    .line 208
    .line 209
    invoke-virtual {v2}, Lio/github/jan/supabase/auth/GoTrueErrorResponse$WeakPassword;->getReasons()Ljava/util/List;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    invoke-direct {p0, v1, v0, p2}, Lio/github/jan/supabase/auth/exception/AuthRestException;-><init>(Ljava/lang/String;Ljava/lang/String;Lyl1;)V

    .line 220
    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_7
    const-string v1, "session_not_found"

    .line 224
    .line 225
    invoke-static {v0, v1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-eqz v0, :cond_8

    .line 230
    .line 231
    new-instance v0, Lav;

    .line 232
    .line 233
    const/4 v2, 0x0

    .line 234
    invoke-direct {v0, p0, v3, v2}, Lav;-><init>(Lio/github/jan/supabase/auth/a;Lf61;I)V

    .line 235
    .line 236
    .line 237
    const/4 v2, 0x3

    .line 238
    iget-object p0, p0, Lio/github/jan/supabase/auth/a;->h:Lig0;

    .line 239
    .line 240
    invoke-static {p0, v3, v3, v0, v2}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 241
    .line 242
    .line 243
    new-instance p0, Lio/github/jan/supabase/auth/exception/AuthSessionMissingException;

    .line 244
    .line 245
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    const-string v0, "Session not found. This can happen if the user was logged out or deleted."

    .line 249
    .line 250
    invoke-direct {p0, v1, v0, p2}, Lio/github/jan/supabase/auth/exception/AuthRestException;-><init>(Ljava/lang/String;Ljava/lang/String;Lyl1;)V

    .line 251
    .line 252
    .line 253
    goto :goto_3

    .line 254
    :cond_8
    invoke-virtual {p1}, Lio/github/jan/supabase/auth/GoTrueErrorResponse;->getError()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    if-eqz p0, :cond_9

    .line 259
    .line 260
    new-instance v0, Lio/github/jan/supabase/auth/exception/AuthRestException;

    .line 261
    .line 262
    invoke-virtual {p1}, Lio/github/jan/supabase/auth/GoTrueErrorResponse;->getDescription()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    invoke-direct {v0, p0, v1, p2}, Lio/github/jan/supabase/auth/exception/AuthRestException;-><init>(Ljava/lang/String;Ljava/lang/String;Lyl1;)V

    .line 267
    .line 268
    .line 269
    move-object p0, v0

    .line 270
    goto :goto_3

    .line 271
    :cond_9
    move-object p0, v3

    .line 272
    :goto_3
    if-eqz p0, :cond_a

    .line 273
    .line 274
    return-object p0

    .line 275
    :cond_a
    invoke-virtual {p2}, Lyl1;->e()Lw63;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    sget-object v0, Lw63;->E:Lw63;

    .line 280
    .line 281
    invoke-static {p0, v0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    if-eqz v0, :cond_c

    .line 286
    .line 287
    new-instance p0, Lio/github/jan/supabase/exceptions/UnauthorizedRestException;

    .line 288
    .line 289
    invoke-virtual {p1}, Lio/github/jan/supabase/auth/GoTrueErrorResponse;->getError()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    if-nez v0, :cond_b

    .line 294
    .line 295
    const-string v0, "Unauthorized"

    .line 296
    .line 297
    :cond_b
    invoke-virtual {p1}, Lio/github/jan/supabase/auth/GoTrueErrorResponse;->getDescription()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    invoke-direct {p0, v0, p1, p2}, Lio/github/jan/supabase/exceptions/RestException;-><init>(Ljava/lang/String;Ljava/lang/String;Lyl1;)V

    .line 302
    .line 303
    .line 304
    goto :goto_4

    .line 305
    :cond_c
    sget-object v0, Lw63;->D:Lw63;

    .line 306
    .line 307
    invoke-static {p0, v0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    if-eqz v0, :cond_e

    .line 312
    .line 313
    new-instance p0, Lio/github/jan/supabase/exceptions/BadRequestRestException;

    .line 314
    .line 315
    invoke-virtual {p1}, Lio/github/jan/supabase/auth/GoTrueErrorResponse;->getError()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    if-nez v0, :cond_d

    .line 320
    .line 321
    const-string v0, "Bad Request"

    .line 322
    .line 323
    :cond_d
    invoke-virtual {p1}, Lio/github/jan/supabase/auth/GoTrueErrorResponse;->getDescription()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    invoke-direct {p0, v0, p1, p2}, Lio/github/jan/supabase/exceptions/RestException;-><init>(Ljava/lang/String;Ljava/lang/String;Lyl1;)V

    .line 328
    .line 329
    .line 330
    goto :goto_4

    .line 331
    :cond_e
    sget-object v0, Lw63;->G:Lw63;

    .line 332
    .line 333
    invoke-static {p0, v0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result p0

    .line 337
    if-eqz p0, :cond_10

    .line 338
    .line 339
    new-instance p0, Lio/github/jan/supabase/exceptions/BadRequestRestException;

    .line 340
    .line 341
    invoke-virtual {p1}, Lio/github/jan/supabase/auth/GoTrueErrorResponse;->getError()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    if-nez v0, :cond_f

    .line 346
    .line 347
    const-string v0, "Unprocessable Entity"

    .line 348
    .line 349
    :cond_f
    invoke-virtual {p1}, Lio/github/jan/supabase/auth/GoTrueErrorResponse;->getDescription()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    invoke-direct {p0, v0, p1, p2}, Lio/github/jan/supabase/exceptions/RestException;-><init>(Ljava/lang/String;Ljava/lang/String;Lyl1;)V

    .line 354
    .line 355
    .line 356
    goto :goto_4

    .line 357
    :cond_10
    new-instance p0, Lio/github/jan/supabase/exceptions/UnknownRestException;

    .line 358
    .line 359
    invoke-virtual {p1}, Lio/github/jan/supabase/auth/GoTrueErrorResponse;->getError()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object p1

    .line 363
    if-nez p1, :cond_11

    .line 364
    .line 365
    const-string p1, "Unknown Error"

    .line 366
    .line 367
    :cond_11
    invoke-direct {p0, p1, v3, p2}, Lio/github/jan/supabase/exceptions/RestException;-><init>(Ljava/lang/String;Ljava/lang/String;Lyl1;)V

    .line 368
    .line 369
    .line 370
    :goto_4
    return-object p0
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
.end method

.method public final f()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Luu;->a:Ltu;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, Ltu;->x:Ljava/lang/String;

    .line 7
    .line 8
    return-object p0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final g()V
    .locals 8

    .line 1
    iget-object v0, p0, Lio/github/jan/supabase/auth/a;->d:Lcf4;

    .line 2
    .line 3
    iget-object v1, v0, Lcf4;->z:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lms3;

    .line 6
    .line 7
    iget-object v2, v0, Lcf4;->z:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lms3;

    .line 10
    .line 11
    iget-object v0, v0, Lcf4;->y:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    sget-object v3, Lub4;->w:Lub4;

    .line 16
    .line 17
    invoke-virtual {v1, v3}, Lms3;->a(Lub4;)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    const/4 v5, 0x0

    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    const-string v4, "Initializing Auth plugin..."

    .line 25
    .line 26
    invoke-virtual {v1, v3, v0, v5, v4}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v1, p0, Lio/github/jan/supabase/auth/a;->c:Lwu;

    .line 30
    .line 31
    iget-boolean v4, v1, Lwu;->w:Z

    .line 32
    .line 33
    const/4 v6, 0x3

    .line 34
    iget-object v7, p0, Lio/github/jan/supabase/auth/a;->h:Lig0;

    .line 35
    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    new-instance v1, Lav;

    .line 39
    .line 40
    const/4 v4, 0x1

    .line 41
    invoke-direct {v1, p0, v5, v4}, Lav;-><init>(Lio/github/jan/supabase/auth/a;Lf61;I)V

    .line 42
    .line 43
    .line 44
    invoke-static {v7, v5, v5, v1, v6}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {v2, v3}, Lms3;->a(Lub4;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_2

    .line 53
    .line 54
    const-string v4, "Skipping loading from storage (autoLoadFromStorage is set to false)"

    .line 55
    .line 56
    invoke-virtual {v2, v3, v0, v5, v4}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    iget-boolean v1, v1, Lwu;->B:Z

    .line 60
    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    new-instance v1, Lav;

    .line 64
    .line 65
    const/4 v4, 0x2

    .line 66
    invoke-direct {v1, p0, v5, v4}, Lav;-><init>(Lio/github/jan/supabase/auth/a;Lf61;I)V

    .line 67
    .line 68
    .line 69
    invoke-static {v7, v5, v5, v1, v6}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 70
    .line 71
    .line 72
    :cond_3
    :goto_0
    invoke-virtual {v2, v3}, Lms3;->a(Lub4;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-eqz p0, :cond_4

    .line 77
    .line 78
    const-string p0, "Initialized Auth plugin"

    .line 79
    .line 80
    invoke-virtual {v2, v3, v0, v5, p0}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_4
    return-void
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final h()Lj77;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/a;->b:Lj77;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final n(Lh61;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p1, Lbv;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lbv;

    .line 7
    .line 8
    iget v1, v0, Lbv;->B:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lbv;->B:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lbv;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lbv;-><init>(Lio/github/jan/supabase/auth/a;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lbv;->z:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lbv;->B:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x2

    .line 31
    sget-object v4, Lvs7;->a:Lvs7;

    .line 32
    .line 33
    const/4 v5, 0x1

    .line 34
    sget-object v6, Lp81;->w:Lp81;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v5, :cond_2

    .line 39
    .line 40
    if-ne v1, v3, :cond_1

    .line 41
    .line 42
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_7

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v2

    .line 52
    :cond_2
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_3
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iput v5, v0, Lbv;->B:I

    .line 60
    .line 61
    iget-object p1, p0, Lio/github/jan/supabase/auth/a;->j:Lkg5;

    .line 62
    .line 63
    iget-object v1, p1, Lkg5;->y:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Lkg5;

    .line 66
    .line 67
    iget-object p1, p1, Lkg5;->x:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p1, Ljava/lang/String;

    .line 70
    .line 71
    iget-object v7, v1, Lkg5;->y:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v7, Lh81;

    .line 74
    .line 75
    new-instance v8, Lc97;

    .line 76
    .line 77
    invoke-direct {v8, v1, p1, v2, v5}, Lc97;-><init>(Lkg5;Ljava/lang/String;Lf61;I)V

    .line 78
    .line 79
    .line 80
    invoke-static {v7, v8, v0}, Lar7;->e0(Le81;Lgs2;Lf61;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-ne p1, v6, :cond_4

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    move-object p1, v4

    .line 88
    :goto_1
    if-ne p1, v6, :cond_5

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_5
    move-object p1, v4

    .line 92
    :goto_2
    if-ne p1, v6, :cond_6

    .line 93
    .line 94
    goto :goto_6

    .line 95
    :cond_6
    :goto_3
    iput v3, v0, Lbv;->B:I

    .line 96
    .line 97
    iget-object p1, p0, Lio/github/jan/supabase/auth/a;->i:Lcf4;

    .line 98
    .line 99
    iget-object v1, p1, Lcf4;->z:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v1, Lkg5;

    .line 102
    .line 103
    iget-object p1, p1, Lcf4;->x:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p1, Ljava/lang/String;

    .line 106
    .line 107
    iget-object v3, v1, Lkg5;->y:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v3, Lh81;

    .line 110
    .line 111
    new-instance v7, Lc97;

    .line 112
    .line 113
    invoke-direct {v7, v1, p1, v2, v5}, Lc97;-><init>(Lkg5;Ljava/lang/String;Lf61;I)V

    .line 114
    .line 115
    .line 116
    invoke-static {v3, v7, v0}, Lar7;->e0(Le81;Lgs2;Lf61;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-ne p1, v6, :cond_7

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_7
    move-object p1, v4

    .line 124
    :goto_4
    if-ne p1, v6, :cond_8

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_8
    move-object p1, v4

    .line 128
    :goto_5
    if-ne p1, v6, :cond_9

    .line 129
    .line 130
    :goto_6
    return-object v6

    .line 131
    :cond_9
    :goto_7
    new-instance p1, Lkn6;

    .line 132
    .line 133
    invoke-direct {p1, v5}, Lkn6;-><init>(Z)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, p1}, Lio/github/jan/supabase/auth/a;->u(Lmn6;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, Lio/github/jan/supabase/auth/a;->w()V

    .line 140
    .line 141
    .line 142
    return-object v4
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method

.method public final o(Lio/github/jan/supabase/auth/user/UserSession;ZLhn6;ZLh61;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    move-object/from16 v5, p5

    .line 12
    .line 13
    instance-of v6, v5, Ldv;

    .line 14
    .line 15
    if-eqz v6, :cond_0

    .line 16
    .line 17
    move-object v6, v5

    .line 18
    check-cast v6, Ldv;

    .line 19
    .line 20
    iget v7, v6, Ldv;->F:I

    .line 21
    .line 22
    const/high16 v8, -0x80000000

    .line 23
    .line 24
    and-int v9, v7, v8

    .line 25
    .line 26
    if-eqz v9, :cond_0

    .line 27
    .line 28
    sub-int/2addr v7, v8

    .line 29
    iput v7, v6, Ldv;->F:I

    .line 30
    .line 31
    :goto_0
    move-object v5, v6

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    new-instance v6, Ldv;

    .line 34
    .line 35
    invoke-direct {v6, v0, v5}, Ldv;-><init>(Lio/github/jan/supabase/auth/a;Lh61;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :goto_1
    iget-object v6, v5, Ldv;->D:Ljava/lang/Object;

    .line 40
    .line 41
    iget v7, v5, Ldv;->F:I

    .line 42
    .line 43
    sget-object v8, Lub4;->w:Lub4;

    .line 44
    .line 45
    const/4 v9, 0x4

    .line 46
    const/4 v10, 0x3

    .line 47
    const/4 v11, 0x2

    .line 48
    const/4 v12, 0x1

    .line 49
    sget-object v13, Lvs7;->a:Lvs7;

    .line 50
    .line 51
    iget-object v14, v0, Lio/github/jan/supabase/auth/a;->d:Lcf4;

    .line 52
    .line 53
    const/16 p5, 0x0

    .line 54
    .line 55
    sget-object v15, Lp81;->w:Lp81;

    .line 56
    .line 57
    if-eqz v7, :cond_5

    .line 58
    .line 59
    if-eq v7, v12, :cond_4

    .line 60
    .line 61
    if-eq v7, v11, :cond_3

    .line 62
    .line 63
    if-eq v7, v10, :cond_2

    .line 64
    .line 65
    if-ne v7, v9, :cond_1

    .line 66
    .line 67
    invoke-static {v6}, Lo85;->q(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_7

    .line 71
    .line 72
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 73
    .line 74
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-object p5

    .line 78
    :cond_2
    iget-boolean v1, v5, Ldv;->C:Z

    .line 79
    .line 80
    iget-boolean v2, v5, Ldv;->B:Z

    .line 81
    .line 82
    iget-object v3, v5, Ldv;->A:Lhn6;

    .line 83
    .line 84
    iget-object v4, v5, Ldv;->z:Lio/github/jan/supabase/auth/user/UserSession;

    .line 85
    .line 86
    invoke-static {v6}, Lo85;->q(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    move-object/from16 v18, v4

    .line 90
    .line 91
    move v4, v1

    .line 92
    move-object/from16 v1, v18

    .line 93
    .line 94
    goto/16 :goto_4

    .line 95
    .line 96
    :cond_3
    invoke-static {v6}, Lo85;->q(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    return-object v13

    .line 100
    :cond_4
    iget-object v1, v5, Ldv;->A:Lhn6;

    .line 101
    .line 102
    iget-object v2, v5, Ldv;->z:Lio/github/jan/supabase/auth/user/UserSession;

    .line 103
    .line 104
    invoke-static {v6}, Lo85;->q(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    move-object v3, v1

    .line 108
    move-object v1, v2

    .line 109
    goto :goto_2

    .line 110
    :cond_5
    invoke-static {v6}, Lo85;->q(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iget-object v6, v14, Lcf4;->z:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v6, Lms3;

    .line 116
    .line 117
    iget-object v7, v14, Lcf4;->y:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v7, Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v6, v8}, Lms3;->a(Lub4;)Z

    .line 122
    .line 123
    .line 124
    move-result v16

    .line 125
    if-eqz v16, :cond_6

    .line 126
    .line 127
    new-instance v9, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    const-string v10, "Importing session "

    .line 130
    .line 131
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string v10, " from "

    .line 138
    .line 139
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string v10, ", auto refresh is set to "

    .line 146
    .line 147
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const/16 v10, 0x2e

    .line 154
    .line 155
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v9

    .line 162
    move-object/from16 v10, p5

    .line 163
    .line 164
    invoke-virtual {v6, v8, v7, v10, v9}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    :cond_6
    iget-object v6, v0, Lio/github/jan/supabase/auth/a;->i:Lcf4;

    .line 168
    .line 169
    iget-object v9, v0, Lio/github/jan/supabase/auth/a;->c:Lwu;

    .line 170
    .line 171
    if-nez v2, :cond_9

    .line 172
    .line 173
    invoke-virtual {v1}, Lio/github/jan/supabase/auth/user/UserSession;->getRefreshToken()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    invoke-static {v7}, Ld57;->I0(Ljava/lang/CharSequence;)Z

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    if-nez v7, :cond_8

    .line 182
    .line 183
    invoke-virtual {v1}, Lio/github/jan/supabase/auth/user/UserSession;->getExpiresIn()J

    .line 184
    .line 185
    .line 186
    move-result-wide v10

    .line 187
    const-wide/16 v16, 0x0

    .line 188
    .line 189
    cmp-long v7, v10, v16

    .line 190
    .line 191
    if-eqz v7, :cond_8

    .line 192
    .line 193
    iget-boolean v7, v9, Lwu;->x:Z

    .line 194
    .line 195
    if-eqz v7, :cond_8

    .line 196
    .line 197
    iput-object v1, v5, Ldv;->z:Lio/github/jan/supabase/auth/user/UserSession;

    .line 198
    .line 199
    iput-object v3, v5, Ldv;->A:Lhn6;

    .line 200
    .line 201
    iput-boolean v2, v5, Ldv;->B:Z

    .line 202
    .line 203
    iput-boolean v4, v5, Ldv;->C:Z

    .line 204
    .line 205
    iput v12, v5, Ldv;->F:I

    .line 206
    .line 207
    invoke-virtual {v6, v1, v5}, Lcf4;->C(Lio/github/jan/supabase/auth/user/UserSession;Lf61;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    if-ne v2, v15, :cond_7

    .line 212
    .line 213
    goto/16 :goto_6

    .line 214
    .line 215
    :cond_7
    :goto_2
    iget-object v2, v14, Lcf4;->z:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v2, Lms3;

    .line 218
    .line 219
    iget-object v4, v14, Lcf4;->y:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v4, Ljava/lang/String;

    .line 222
    .line 223
    invoke-virtual {v2, v8}, Lms3;->a(Lub4;)Z

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    if-eqz v5, :cond_8

    .line 228
    .line 229
    const-string v5, "Session saved to storage (no auto refresh)"

    .line 230
    .line 231
    const/4 v10, 0x0

    .line 232
    invoke-virtual {v2, v8, v4, v10, v5}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    :cond_8
    new-instance v2, Lin6;

    .line 236
    .line 237
    invoke-direct {v2, v1, v3}, Lin6;-><init>(Lio/github/jan/supabase/auth/user/UserSession;Lhn6;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0, v2}, Lio/github/jan/supabase/auth/a;->u(Lmn6;)V

    .line 241
    .line 242
    .line 243
    iget-object v0, v14, Lcf4;->z:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v0, Lms3;

    .line 246
    .line 247
    iget-object v1, v14, Lcf4;->y:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v1, Ljava/lang/String;

    .line 250
    .line 251
    invoke-virtual {v0, v8}, Lms3;->a(Lub4;)Z

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    if-eqz v2, :cond_10

    .line 256
    .line 257
    const-string v2, "Session imported successfully."

    .line 258
    .line 259
    const/4 v10, 0x0

    .line 260
    invoke-virtual {v0, v8, v1, v10, v2}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    return-object v13

    .line 264
    :cond_9
    invoke-virtual {v1}, Lio/github/jan/supabase/auth/user/UserSession;->getExpiresAt()Lqd3;

    .line 265
    .line 266
    .line 267
    move-result-object v10

    .line 268
    sget-object v12, Lu02;->x:Lxb4;

    .line 269
    .line 270
    invoke-virtual {v1}, Lio/github/jan/supabase/auth/user/UserSession;->getExpiresIn()J

    .line 271
    .line 272
    .line 273
    move-result-wide v11

    .line 274
    sget-object v0, Ly02;->z:Ly02;

    .line 275
    .line 276
    invoke-static {v11, v12, v0}, Lgl0;->f0(JLy02;)J

    .line 277
    .line 278
    .line 279
    move-result-wide v11

    .line 280
    const-wide v0, 0x3fc9999999999998L    # 0.19999999999999996

    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    invoke-static {v11, v12, v0, v1}, Lu02;->i(JD)J

    .line 286
    .line 287
    .line 288
    move-result-wide v0

    .line 289
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    invoke-static {v0, v1}, Lu02;->l(J)J

    .line 293
    .line 294
    .line 295
    move-result-wide v0

    .line 296
    invoke-virtual {v10, v0, v1}, Lqd3;->b(J)Lqd3;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    sget-object v1, Ltd3;->a:Lds0;

    .line 301
    .line 302
    invoke-interface {v1}, Lds0;->c()Lqd3;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    invoke-virtual {v0, v1}, Lqd3;->a(Lqd3;)I

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-gtz v0, :cond_b

    .line 311
    .line 312
    iget-object v0, v14, Lcf4;->z:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v0, Lms3;

    .line 315
    .line 316
    invoke-virtual {v0, v8}, Lms3;->a(Lub4;)Z

    .line 317
    .line 318
    .line 319
    move-result v1

    .line 320
    if-eqz v1, :cond_a

    .line 321
    .line 322
    const-string v1, "Session is under the threshold date. Refreshing session..."

    .line 323
    .line 324
    const/4 v10, 0x0

    .line 325
    invoke-virtual {v0, v8, v7, v10, v1}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    goto :goto_3

    .line 329
    :cond_a
    const/4 v10, 0x0

    .line 330
    :goto_3
    iput-object v10, v5, Ldv;->z:Lio/github/jan/supabase/auth/user/UserSession;

    .line 331
    .line 332
    iput-object v10, v5, Ldv;->A:Lhn6;

    .line 333
    .line 334
    iput-boolean v2, v5, Ldv;->B:Z

    .line 335
    .line 336
    iput-boolean v4, v5, Ldv;->C:Z

    .line 337
    .line 338
    const/4 v0, 0x2

    .line 339
    iput v0, v5, Ldv;->F:I

    .line 340
    .line 341
    const/4 v3, 0x0

    .line 342
    move-object/from16 v0, p0

    .line 343
    .line 344
    move-object/from16 v1, p1

    .line 345
    .line 346
    move-object/from16 v2, p3

    .line 347
    .line 348
    invoke-virtual/range {v0 .. v5}, Lio/github/jan/supabase/auth/a;->r(Lio/github/jan/supabase/auth/user/UserSession;Lhn6;ZZLdv;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    if-ne v0, v15, :cond_10

    .line 353
    .line 354
    goto :goto_6

    .line 355
    :cond_b
    move-object/from16 v0, p0

    .line 356
    .line 357
    move-object/from16 v1, p1

    .line 358
    .line 359
    iget-boolean v7, v9, Lwu;->x:Z

    .line 360
    .line 361
    if-eqz v7, :cond_d

    .line 362
    .line 363
    iput-object v1, v5, Ldv;->z:Lio/github/jan/supabase/auth/user/UserSession;

    .line 364
    .line 365
    iput-object v3, v5, Ldv;->A:Lhn6;

    .line 366
    .line 367
    iput-boolean v2, v5, Ldv;->B:Z

    .line 368
    .line 369
    iput-boolean v4, v5, Ldv;->C:Z

    .line 370
    .line 371
    const/4 v7, 0x3

    .line 372
    iput v7, v5, Ldv;->F:I

    .line 373
    .line 374
    invoke-virtual {v6, v1, v5}, Lcf4;->C(Lio/github/jan/supabase/auth/user/UserSession;Lf61;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v6

    .line 378
    if-ne v6, v15, :cond_c

    .line 379
    .line 380
    goto :goto_6

    .line 381
    :cond_c
    :goto_4
    iget-object v6, v14, Lcf4;->z:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v6, Lms3;

    .line 384
    .line 385
    iget-object v7, v14, Lcf4;->y:Ljava/lang/Object;

    .line 386
    .line 387
    check-cast v7, Ljava/lang/String;

    .line 388
    .line 389
    invoke-virtual {v6, v8}, Lms3;->a(Lub4;)Z

    .line 390
    .line 391
    .line 392
    move-result v9

    .line 393
    if-eqz v9, :cond_d

    .line 394
    .line 395
    const-string v9, "Session saved to storage (auto refresh enabled)"

    .line 396
    .line 397
    const/4 v10, 0x0

    .line 398
    invoke-virtual {v6, v8, v7, v10, v9}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    :cond_d
    new-instance v6, Lin6;

    .line 402
    .line 403
    invoke-direct {v6, v1, v3}, Lin6;-><init>(Lio/github/jan/supabase/auth/user/UserSession;Lhn6;)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v0, v6}, Lio/github/jan/supabase/auth/a;->u(Lmn6;)V

    .line 407
    .line 408
    .line 409
    iget-object v6, v14, Lcf4;->z:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast v6, Lms3;

    .line 412
    .line 413
    iget-object v7, v14, Lcf4;->y:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v7, Ljava/lang/String;

    .line 416
    .line 417
    invoke-virtual {v6, v8}, Lms3;->a(Lub4;)Z

    .line 418
    .line 419
    .line 420
    move-result v9

    .line 421
    if-eqz v9, :cond_e

    .line 422
    .line 423
    const-string v9, "Session imported successfully. Starting auto refresh..."

    .line 424
    .line 425
    const/4 v10, 0x0

    .line 426
    invoke-virtual {v6, v8, v7, v10, v9}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    goto :goto_5

    .line 430
    :cond_e
    const/4 v10, 0x0

    .line 431
    :goto_5
    iput-object v10, v5, Ldv;->z:Lio/github/jan/supabase/auth/user/UserSession;

    .line 432
    .line 433
    iput-object v10, v5, Ldv;->A:Lhn6;

    .line 434
    .line 435
    iput-boolean v2, v5, Ldv;->B:Z

    .line 436
    .line 437
    iput-boolean v4, v5, Ldv;->C:Z

    .line 438
    .line 439
    const/4 v2, 0x4

    .line 440
    iput v2, v5, Ldv;->F:I

    .line 441
    .line 442
    move-object v2, v3

    .line 443
    const/4 v3, 0x1

    .line 444
    invoke-virtual/range {v0 .. v5}, Lio/github/jan/supabase/auth/a;->r(Lio/github/jan/supabase/auth/user/UserSession;Lhn6;ZZLdv;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    if-ne v0, v15, :cond_f

    .line 449
    .line 450
    :goto_6
    return-object v15

    .line 451
    :cond_f
    :goto_7
    iget-object v0, v14, Lcf4;->z:Ljava/lang/Object;

    .line 452
    .line 453
    check-cast v0, Lms3;

    .line 454
    .line 455
    iget-object v1, v14, Lcf4;->y:Ljava/lang/Object;

    .line 456
    .line 457
    check-cast v1, Ljava/lang/String;

    .line 458
    .line 459
    invoke-virtual {v0, v8}, Lms3;->a(Lub4;)Z

    .line 460
    .line 461
    .line 462
    move-result v2

    .line 463
    if-eqz v2, :cond_10

    .line 464
    .line 465
    const-string v2, "Auto refresh started."

    .line 466
    .line 467
    const/4 v10, 0x0

    .line 468
    invoke-virtual {v0, v8, v1, v10, v2}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    :cond_10
    return-object v13
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
.end method

.method public final p(ZZLh61;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, Lev;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lev;

    .line 7
    .line 8
    iget v1, v0, Lev;->E:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lev;->E:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lev;

    .line 22
    .line 23
    invoke-direct {v0, p0, p3}, Lev;-><init>(Lio/github/jan/supabase/auth/a;Lh61;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p3, v6, Lev;->C:Ljava/lang/Object;

    .line 28
    .line 29
    iget v0, v6, Lev;->E:I

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    const/4 v2, 0x2

    .line 33
    const/4 v7, 0x1

    .line 34
    sget-object v8, Lp81;->w:Lp81;

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    if-eq v0, v7, :cond_2

    .line 39
    .line 40
    if-ne v0, v2, :cond_1

    .line 41
    .line 42
    iget-object p0, v6, Lev;->B:Lio/github/jan/supabase/auth/user/UserSession;

    .line 43
    .line 44
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_7

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    :cond_2
    iget-boolean p2, v6, Lev;->A:Z

    .line 55
    .line 56
    iget-boolean p1, v6, Lev;->z:Z

    .line 57
    .line 58
    :try_start_0
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :catch_0
    move-exception v0

    .line 63
    move-object p3, v0

    .line 64
    goto :goto_4

    .line 65
    :cond_3
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :try_start_1
    iget-object p3, p0, Lio/github/jan/supabase/auth/a;->i:Lcf4;

    .line 69
    .line 70
    iput-boolean p1, v6, Lev;->z:Z

    .line 71
    .line 72
    iput-boolean p2, v6, Lev;->A:Z

    .line 73
    .line 74
    iput v7, v6, Lev;->E:I

    .line 75
    .line 76
    invoke-virtual {p3, v6}, Lcf4;->v(Lf61;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    if-ne p3, v8, :cond_4

    .line 81
    .line 82
    goto :goto_6

    .line 83
    :cond_4
    :goto_2
    check-cast p3, Lio/github/jan/supabase/auth/user/UserSession;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 84
    .line 85
    move-object v1, p3

    .line 86
    :cond_5
    :goto_3
    move v3, p1

    .line 87
    move v5, p2

    .line 88
    goto :goto_5

    .line 89
    :goto_4
    iget-object v0, v6, Lh61;->x:Le81;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-static {v0}, Lr16;->x(Le81;)V

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Lio/github/jan/supabase/auth/a;->d:Lcf4;

    .line 98
    .line 99
    iget-object v3, v0, Lcf4;->z:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v3, Lms3;

    .line 102
    .line 103
    iget-object v0, v0, Lcf4;->y:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, Ljava/lang/String;

    .line 106
    .line 107
    sget-object v4, Lub4;->z:Lub4;

    .line 108
    .line 109
    invoke-virtual {v3, v4}, Lms3;->a(Lub4;)Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-eqz v5, :cond_5

    .line 114
    .line 115
    const-string v5, "Failed to load session"

    .line 116
    .line 117
    invoke-virtual {v3, v4, v0, p3, v5}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :goto_5
    if-eqz v1, :cond_7

    .line 122
    .line 123
    iput-object v1, v6, Lev;->B:Lio/github/jan/supabase/auth/user/UserSession;

    .line 124
    .line 125
    iput-boolean v3, v6, Lev;->z:Z

    .line 126
    .line 127
    iput-boolean v5, v6, Lev;->A:Z

    .line 128
    .line 129
    iput v2, v6, Lev;->E:I

    .line 130
    .line 131
    sget-object v4, Lfn6;->a:Lfn6;

    .line 132
    .line 133
    move-object v2, v1

    .line 134
    move-object v1, p0

    .line 135
    invoke-virtual/range {v1 .. v6}, Lio/github/jan/supabase/auth/a;->o(Lio/github/jan/supabase/auth/user/UserSession;ZLhn6;ZLh61;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    if-ne p0, v8, :cond_6

    .line 140
    .line 141
    :goto_6
    return-object v8

    .line 142
    :cond_6
    move-object p0, v2

    .line 143
    :goto_7
    move-object v1, p0

    .line 144
    goto :goto_8

    .line 145
    :cond_7
    move-object v2, v1

    .line 146
    :goto_8
    if-eqz v1, :cond_8

    .line 147
    .line 148
    goto :goto_9

    .line 149
    :cond_8
    const/4 v7, 0x0

    .line 150
    :goto_9
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    return-object p0
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
.end method

.method public final q()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lio/github/jan/supabase/auth/a;->c:Lwu;

    .line 2
    .line 3
    iget-object v0, v0, Lwu;->y:Ltj2;

    .line 4
    .line 5
    sget-object v1, Ltj2;->x:Ltj2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    return-object v2

    .line 11
    :cond_0
    const/16 v0, 0x40

    .line 12
    .line 13
    new-array v0, v0, [B

    .line 14
    .line 15
    sget-object v1, Loc1;->b:Lpc1;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v1, v1, Lpc1;->c:Ljava/security/SecureRandom;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 23
    .line 24
    .line 25
    sget-object v1, Lm50;->f:Lk50;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    sget-object v1, Lm50;->h:Lm50;

    .line 31
    .line 32
    invoke-static {v1, v0}, Lm50;->a(Lm50;[B)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v1, Ln0;

    .line 37
    .line 38
    const/16 v3, 0x8

    .line 39
    .line 40
    invoke-direct {v1, p0, v0, v2, v3}, Ln0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 41
    .line 42
    .line 43
    const/4 v3, 0x3

    .line 44
    iget-object p0, p0, Lio/github/jan/supabase/auth/a;->h:Lig0;

    .line 45
    .line 46
    invoke-static {p0, v2, v2, v1, v3}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Lw95;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final r(Lio/github/jan/supabase/auth/user/UserSession;Lhn6;ZZLdv;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lio/github/jan/supabase/auth/a;->n:Lh27;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Lll3;->o(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    new-instance v2, Lhv;

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v8, 0x0

    .line 13
    move-object v4, p0

    .line 14
    move-object v5, p1

    .line 15
    move-object v6, p2

    .line 16
    move v3, p3

    .line 17
    invoke-direct/range {v2 .. v8}, Lhv;-><init>(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x3

    .line 21
    iget-object p1, v4, Lio/github/jan/supabase/auth/a;->h:Lig0;

    .line 22
    .line 23
    invoke-static {p1, v1, v1, v2, p0}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    iput-object p0, v4, Lio/github/jan/supabase/auth/a;->n:Lh27;

    .line 28
    .line 29
    if-eqz p4, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0, p5}, Lll3;->j0(Lh61;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    sget-object p1, Lp81;->w:Lp81;

    .line 36
    .line 37
    if-ne p0, p1, :cond_1

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_1
    sget-object p0, Lvs7;->a:Lvs7;

    .line 41
    .line 42
    return-object p0
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
.end method

.method public final s(Lh61;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Liv;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Liv;

    .line 7
    .line 8
    iget v1, v0, Liv;->B:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Liv;->B:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Liv;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Liv;-><init>(Lio/github/jan/supabase/auth/a;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Liv;->z:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Liv;->B:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x2

    .line 31
    const/4 v4, 0x1

    .line 32
    sget-object v5, Lp81;->w:Lp81;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    if-eq v1, v4, :cond_2

    .line 37
    .line 38
    if-ne v1, v3, :cond_1

    .line 39
    .line 40
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v2

    .line 50
    :cond_2
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {p0}, Luu;->i()Lio/github/jan/supabase/auth/user/UserSession;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-eqz p1, :cond_7

    .line 62
    .line 63
    invoke-virtual {p1}, Lio/github/jan/supabase/auth/user/UserSession;->getRefreshToken()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-eqz p1, :cond_7

    .line 68
    .line 69
    iput v4, v0, Liv;->B:I

    .line 70
    .line 71
    invoke-virtual {p0, p1, v0}, Lio/github/jan/supabase/auth/a;->t(Ljava/lang/String;Lh61;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-ne p1, v5, :cond_4

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    :goto_1
    check-cast p1, Lio/github/jan/supabase/auth/user/UserSession;

    .line 79
    .line 80
    new-instance v1, Lcn6;

    .line 81
    .line 82
    invoke-interface {p0}, Luu;->i()Lio/github/jan/supabase/auth/user/UserSession;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    if-eqz v4, :cond_6

    .line 87
    .line 88
    invoke-direct {v1, v4}, Lcn6;-><init>(Lio/github/jan/supabase/auth/user/UserSession;)V

    .line 89
    .line 90
    .line 91
    iput v3, v0, Liv;->B:I

    .line 92
    .line 93
    invoke-static {p0, p1, v1, v0}, Luu;->c(Luu;Lio/github/jan/supabase/auth/user/UserSession;Lhn6;Lh61;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    if-ne p1, v5, :cond_5

    .line 98
    .line 99
    :goto_2
    return-object v5

    .line 100
    :cond_5
    :goto_3
    sget-object p1, Ltd3;->a:Lds0;

    .line 101
    .line 102
    invoke-interface {p1}, Lds0;->c()Lqd3;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p0, v2, p1}, Lio/github/jan/supabase/auth/a;->x(Lqd3;Lqd3;)V

    .line 107
    .line 108
    .line 109
    sget-object p0, Lvs7;->a:Lvs7;

    .line 110
    .line 111
    return-object p0

    .line 112
    :cond_6
    const-string p0, "No session found"

    .line 113
    .line 114
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-object v2

    .line 118
    :cond_7
    const-string p0, "No refresh token found in current session"

    .line 119
    .line 120
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    return-object v2
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method

.method public final t(Ljava/lang/String;Lh61;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Lkv;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lkv;

    .line 7
    .line 8
    iget v1, v0, Lkv;->C:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lkv;->C:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lkv;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lkv;-><init>(Lio/github/jan/supabase/auth/a;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lkv;->A:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lkv;->C:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    const/4 v4, 0x0

    .line 32
    sget-object v5, Lp81;->w:Lp81;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    if-eq v1, v3, :cond_2

    .line 37
    .line 38
    if-ne v1, v2, :cond_1

    .line 39
    .line 40
    iget-object p0, v0, Lkv;->z:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v4

    .line 52
    :cond_2
    iget-object p0, v0, Lkv;->z:Ljava/lang/String;

    .line 53
    .line 54
    check-cast p0, Lkotlinx/serialization/json/JsonObject;

    .line 55
    .line 56
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object p2, p0, Lio/github/jan/supabase/auth/a;->d:Lcf4;

    .line 64
    .line 65
    iget-object v1, p2, Lcf4;->z:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v1, Lms3;

    .line 68
    .line 69
    iget-object p2, p2, Lcf4;->y:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p2, Ljava/lang/String;

    .line 72
    .line 73
    sget-object v6, Lub4;->w:Lub4;

    .line 74
    .line 75
    invoke-virtual {v1, v6}, Lms3;->a(Lub4;)Z

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    if-eqz v7, :cond_4

    .line 80
    .line 81
    const-string v7, "Refreshing session"

    .line 82
    .line 83
    invoke-virtual {v1, v6, p2, v4, v7}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :cond_4
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 87
    .line 88
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-static {p1}, Lem3;->b(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    const-string v1, "refresh_token"

    .line 99
    .line 100
    invoke-interface {p2, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    .line 105
    .line 106
    new-instance p1, Lkotlinx/serialization/json/JsonObject;

    .line 107
    .line 108
    invoke-direct {p1, p2}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    .line 109
    .line 110
    .line 111
    sget-object p2, Ll51;->c:Lq51;

    .line 112
    .line 113
    new-instance v1, Ljv;

    .line 114
    .line 115
    const/4 v6, 0x0

    .line 116
    invoke-direct {v1, p2, p1, v6}, Ljv;-><init>(Lq51;Lkotlinx/serialization/json/JsonObject;I)V

    .line 117
    .line 118
    .line 119
    iput-object v4, v0, Lkv;->z:Ljava/lang/String;

    .line 120
    .line 121
    iput v3, v0, Lkv;->C:I

    .line 122
    .line 123
    iget-object p0, p0, Lio/github/jan/supabase/auth/a;->l:Li77;

    .line 124
    .line 125
    const-string p1, "token?grant_type=refresh_token"

    .line 126
    .line 127
    invoke-virtual {p0, p1, v1, v0}, Li77;->a(Ljava/lang/String;Lvr2;Lh61;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    if-ne p2, v5, :cond_5

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_5
    :goto_1
    check-cast p2, Lyl1;

    .line 135
    .line 136
    const-string p0, "Auth#refreshSession"

    .line 137
    .line 138
    iput-object p0, v0, Lkv;->z:Ljava/lang/String;

    .line 139
    .line 140
    iput v2, v0, Lkv;->C:I

    .line 141
    .line 142
    sget-object p1, Lmo0;->a:Ljava/nio/charset/Charset;

    .line 143
    .line 144
    invoke-static {p2, p1, v0}, Lh49;->q(Lyl1;Ljava/nio/charset/Charset;Lh61;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    if-ne p2, v5, :cond_6

    .line 149
    .line 150
    :goto_2
    return-object v5

    .line 151
    :cond_6
    :goto_3
    check-cast p2, Ljava/lang/String;

    .line 152
    .line 153
    const-string p1, ""

    .line 154
    .line 155
    if-eqz p0, :cond_7

    .line 156
    .line 157
    const-string v0, " in "

    .line 158
    .line 159
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    goto :goto_4

    .line 164
    :cond_7
    move-object p0, p1

    .line 165
    :goto_4
    :try_start_0
    sget-object v0, Ll18;->a:Lkm3;

    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    sget-object v1, Lio/github/jan/supabase/auth/user/UserSession;->Companion:Lfy7;

    .line 171
    .line 172
    invoke-virtual {v1}, Lfy7;->serializer()Lzr3;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    check-cast v1, Lzr3;

    .line 177
    .line 178
    invoke-virtual {v0, v1, p2}, Lpl3;->b(Lzr3;Ljava/lang/String;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p0
    :try_end_0
    .catch Lkotlinx/serialization/MissingFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 182
    return-object p0

    .line 183
    :catch_0
    new-instance v0, Lio/github/jan/supabase/exceptions/SupabaseEncodingException;

    .line 184
    .line 185
    const-string v1, "Couldn\'t decode payload"

    .line 186
    .line 187
    const-string v2, " as "

    .line 188
    .line 189
    invoke-static {v1, p0, v2}, Lb81;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    const-class v1, Lio/github/jan/supabase/auth/user/UserSession;

    .line 194
    .line 195
    sget-object v2, Lb26;->a:Lc26;

    .line 196
    .line 197
    invoke-virtual {v2, v1}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-interface {v1}, Lgq3;->A()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    const-string v1, ". Input: "

    .line 209
    .line 210
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    const-string v1, "\n"

    .line 214
    .line 215
    invoke-static {p2, v1, p1}, Lk57;->s0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    throw v0
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
.end method

.method public final u(Lmn6;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lio/github/jan/supabase/auth/a;->d:Lcf4;

    .line 2
    .line 3
    iget-object v1, v0, Lcf4;->z:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lms3;

    .line 6
    .line 7
    iget-object v0, v0, Lcf4;->y:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/lang/String;

    .line 10
    .line 11
    sget-object v2, Lub4;->w:Lub4;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Lms3;->a(Lub4;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    new-instance v3, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v5, "Setting session status to "

    .line 23
    .line 24
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v1, v2, v0, v4, v3}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object p0, p0, Lio/github/jan/supabase/auth/a;->e:Ld37;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v4, p1}, Ld37;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    return-void
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public final v(Lkt6;Lh61;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, Lmv;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lmv;

    .line 7
    .line 8
    iget v1, v0, Lmv;->C:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lmv;->C:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lmv;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lmv;-><init>(Lio/github/jan/supabase/auth/a;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lmv;->A:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lmv;->C:I

    .line 28
    .line 29
    sget-object v2, Lub4;->w:Lub4;

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    iget-object v5, p0, Lio/github/jan/supabase/auth/a;->d:Lcf4;

    .line 34
    .line 35
    const/4 v6, 0x0

    .line 36
    sget-object v7, Lp81;->w:Lp81;

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    if-eq v1, v4, :cond_2

    .line 41
    .line 42
    if-ne v1, v3, :cond_1

    .line 43
    .line 44
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v6

    .line 55
    :cond_2
    iget-object p1, v0, Lmv;->z:Lkt6;

    .line 56
    .line 57
    :try_start_0
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_0
    .catch Lio/github/jan/supabase/exceptions/RestException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :catch_0
    move-exception p2

    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {p0}, Luu;->i()Lio/github/jan/supabase/auth/user/UserSession;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    if-eqz p2, :cond_6

    .line 71
    .line 72
    :try_start_1
    iget-object p2, p0, Lio/github/jan/supabase/auth/a;->m:Law;

    .line 73
    .line 74
    const-string v1, "logout"

    .line 75
    .line 76
    new-instance v8, Lb0;

    .line 77
    .line 78
    const/4 v9, 0x7

    .line 79
    invoke-direct {v8, v9, p1}, Lb0;-><init>(ILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iput-object p1, v0, Lmv;->z:Lkt6;

    .line 83
    .line 84
    iput v4, v0, Lmv;->C:I

    .line 85
    .line 86
    invoke-virtual {p2, v1, v8, v0}, Li77;->a(Ljava/lang/String;Lvr2;Lh61;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p2
    :try_end_1
    .catch Lio/github/jan/supabase/exceptions/RestException; {:try_start_1 .. :try_end_1} :catch_0

    .line 90
    if-ne p2, v7, :cond_4

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :goto_1
    sget-object v1, Lqv;->a:Ljava/util/List;

    .line 94
    .line 95
    new-instance v4, Ljava/lang/Integer;

    .line 96
    .line 97
    iget v8, p2, Lio/github/jan/supabase/exceptions/RestException;->w:I

    .line 98
    .line 99
    invoke-direct {v4, v8}, Ljava/lang/Integer;-><init>(I)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v1, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_5

    .line 107
    .line 108
    iget-object p2, v5, Lcf4;->z:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast p2, Lms3;

    .line 111
    .line 112
    iget-object v1, v5, Lcf4;->y:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v1, Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {p2, v2}, Lms3;->a(Lub4;)Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-eqz v4, :cond_4

    .line 121
    .line 122
    const-string v4, "Received error code "

    .line 123
    .line 124
    const-string v9, " while signing out user. This can happen if the user doesn\'t exist anymore or the JWT is invalid/expired. Proceeding to clean up local data..."

    .line 125
    .line 126
    invoke-static {v8, v4, v9}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-virtual {p2, v2, v1, v6, v4}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :cond_4
    :goto_2
    iget-object p2, v5, Lcf4;->z:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast p2, Lms3;

    .line 136
    .line 137
    iget-object v1, v5, Lcf4;->y:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v1, Ljava/lang/String;

    .line 140
    .line 141
    invoke-virtual {p2, v2}, Lms3;->a(Lub4;)Z

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    if-eqz v4, :cond_7

    .line 146
    .line 147
    const-string v4, "Logged out session in Supabase"

    .line 148
    .line 149
    invoke-virtual {p2, v2, v1, v6, v4}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_5
    throw p2

    .line 154
    :cond_6
    iget-object p2, v5, Lcf4;->z:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast p2, Lms3;

    .line 157
    .line 158
    iget-object v1, v5, Lcf4;->y:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v1, Ljava/lang/String;

    .line 161
    .line 162
    sget-object v4, Lub4;->x:Lub4;

    .line 163
    .line 164
    invoke-virtual {p2, v4}, Lms3;->a(Lub4;)Z

    .line 165
    .line 166
    .line 167
    move-result v8

    .line 168
    if-eqz v8, :cond_7

    .line 169
    .line 170
    const-string v8, "Skipping session logout as there is no session available. Proceeding to clean up local data..."

    .line 171
    .line 172
    invoke-virtual {p2, v4, v1, v6, v8}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    :cond_7
    :goto_3
    sget-object p2, Lkt6;->x:Lkt6;

    .line 176
    .line 177
    if-eq p1, p2, :cond_8

    .line 178
    .line 179
    iput-object v6, v0, Lmv;->z:Lkt6;

    .line 180
    .line 181
    iput v3, v0, Lmv;->C:I

    .line 182
    .line 183
    invoke-virtual {p0, v0}, Lio/github/jan/supabase/auth/a;->n(Lh61;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    if-ne p0, v7, :cond_8

    .line 188
    .line 189
    :goto_4
    return-object v7

    .line 190
    :cond_8
    :goto_5
    iget-object p0, v5, Lcf4;->z:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast p0, Lms3;

    .line 193
    .line 194
    iget-object p1, v5, Lcf4;->y:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast p1, Ljava/lang/String;

    .line 197
    .line 198
    invoke-virtual {p0, v2}, Lms3;->a(Lub4;)Z

    .line 199
    .line 200
    .line 201
    move-result p2

    .line 202
    if-eqz p2, :cond_9

    .line 203
    .line 204
    const-string p2, "Successfully logged out"

    .line 205
    .line 206
    invoke-virtual {p0, v2, p1, v6, p2}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    :cond_9
    sget-object p0, Lvs7;->a:Lvs7;

    .line 210
    .line 211
    return-object p0
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
.end method

.method public final w()V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/github/jan/supabase/auth/a;->d:Lcf4;

    .line 2
    .line 3
    iget-object v1, v0, Lcf4;->z:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lms3;

    .line 6
    .line 7
    iget-object v0, v0, Lcf4;->y:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/lang/String;

    .line 10
    .line 11
    sget-object v2, Lub4;->w:Lub4;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Lms3;->a(Lub4;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    const-string v3, "Stopping auto refresh for current session"

    .line 21
    .line 22
    invoke-virtual {v1, v2, v0, v4, v3}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lio/github/jan/supabase/auth/a;->n:Lh27;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0, v4}, Lll3;->o(Ljava/util/concurrent/CancellationException;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    iput-object v4, p0, Lio/github/jan/supabase/auth/a;->n:Lh27;

    .line 33
    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final x(Lqd3;Lqd3;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/github/jan/supabase/auth/a;->o:Lan6;

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object p1, v0, Lan6;->c:Lqd3;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p1, v1

    .line 14
    :cond_1
    :goto_0
    if-nez p2, :cond_3

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget-object p2, v0, Lan6;->b:Lqd3;

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_2
    move-object p2, v1

    .line 22
    :cond_3
    :goto_1
    iget-object v0, v0, Lan6;->a:Lqd3;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v1, Lan6;

    .line 28
    .line 29
    invoke-direct {v1, v0, p2, p1}, Lan6;-><init>(Lqd3;Lqd3;Lqd3;)V

    .line 30
    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_4
    new-instance v1, Lan6;

    .line 34
    .line 35
    sget-object v0, Ltd3;->a:Lds0;

    .line 36
    .line 37
    invoke-interface {v0}, Lds0;->c()Lqd3;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-direct {v1, v0, p2, p1}, Lan6;-><init>(Lqd3;Lqd3;Lqd3;)V

    .line 42
    .line 43
    .line 44
    :goto_2
    iput-object v1, p0, Lio/github/jan/supabase/auth/a;->o:Lan6;

    .line 45
    .line 46
    return-void
    .line 47
.end method

.method public final y(ZLu6;Lh61;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, Lov;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lov;

    .line 11
    .line 12
    iget v3, v2, Lov;->E:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lov;->E:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lov;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lov;-><init>(Lio/github/jan/supabase/auth/a;Lh61;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lov;->C:Ljava/lang/Object;

    .line 30
    .line 31
    iget v3, v2, Lov;->E:I

    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    const/4 v5, 0x2

    .line 35
    const/4 v6, 0x1

    .line 36
    const/4 v7, 0x0

    .line 37
    sget-object v8, Lp81;->w:Lp81;

    .line 38
    .line 39
    if-eqz v3, :cond_4

    .line 40
    .line 41
    if-eq v3, v6, :cond_3

    .line 42
    .line 43
    if-eq v3, v5, :cond_2

    .line 44
    .line 45
    if-ne v3, v4, :cond_1

    .line 46
    .line 47
    iget-object v3, v2, Lov;->B:Lio/github/jan/supabase/auth/user/UserSession;

    .line 48
    .line 49
    iget-object v2, v2, Lov;->A:Lio/github/jan/supabase/auth/user/UserInfo;

    .line 50
    .line 51
    invoke-static {v1}, Lo85;->q(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_4

    .line 55
    .line 56
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v7

    .line 62
    :cond_2
    iget-boolean v3, v2, Lov;->z:Z

    .line 63
    .line 64
    iget-object v5, v2, Lov;->A:Lio/github/jan/supabase/auth/user/UserInfo;

    .line 65
    .line 66
    check-cast v5, Lyl1;

    .line 67
    .line 68
    invoke-static {v1}, Lo85;->q(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto/16 :goto_2

    .line 72
    .line 73
    :cond_3
    iget-boolean v3, v2, Lov;->z:Z

    .line 74
    .line 75
    iget-object v6, v2, Lov;->B:Lio/github/jan/supabase/auth/user/UserSession;

    .line 76
    .line 77
    check-cast v6, Ljava/lang/String;

    .line 78
    .line 79
    iget-object v6, v2, Lov;->A:Lio/github/jan/supabase/auth/user/UserInfo;

    .line 80
    .line 81
    check-cast v6, Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v1}, Lo85;->q(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    move/from16 v22, v3

    .line 87
    .line 88
    move-object v3, v1

    .line 89
    move/from16 v1, v22

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    invoke-static {v1}, Lo85;->q(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    new-instance v9, Lio/github/jan/supabase/auth/user/UserUpdateBuilder;

    .line 96
    .line 97
    const/16 v17, 0x3f

    .line 98
    .line 99
    const/16 v18, 0x0

    .line 100
    .line 101
    const/4 v10, 0x0

    .line 102
    const/4 v11, 0x0

    .line 103
    const/4 v12, 0x0

    .line 104
    const/4 v13, 0x0

    .line 105
    const/4 v14, 0x0

    .line 106
    const/4 v15, 0x0

    .line 107
    iget-object v1, v0, Lio/github/jan/supabase/auth/a;->p:Lt77;

    .line 108
    .line 109
    move-object/from16 v16, v1

    .line 110
    .line 111
    invoke-direct/range {v9 .. v18}, Lio/github/jan/supabase/auth/user/UserUpdateBuilder;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lt77;ILhl1;)V

    .line 112
    .line 113
    .line 114
    move-object/from16 v1, p2

    .line 115
    .line 116
    invoke-virtual {v1, v9}, Lu6;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Lio/github/jan/supabase/auth/a;->q()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    new-instance v3, Lvm3;

    .line 124
    .line 125
    invoke-direct {v3}, Lvm3;-><init>()V

    .line 126
    .line 127
    .line 128
    sget-object v10, Ll18;->a:Lkm3;

    .line 129
    .line 130
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    sget-object v11, Lio/github/jan/supabase/auth/user/UserUpdateBuilder;->Companion:Lhy7;

    .line 134
    .line 135
    invoke-virtual {v11}, Lhy7;->serializer()Lzr3;

    .line 136
    .line 137
    .line 138
    move-result-object v11

    .line 139
    check-cast v11, Lzr3;

    .line 140
    .line 141
    invoke-virtual {v10, v11, v9}, Lpl3;->c(Lzr3;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    invoke-static {v9}, Lem3;->e(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    invoke-static {v3, v9}, Ll18;->a(Lvm3;Lkotlinx/serialization/json/JsonObject;)V

    .line 150
    .line 151
    .line 152
    if-eqz v1, :cond_5

    .line 153
    .line 154
    invoke-static {v3, v1}, Lag8;->C(Lvm3;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :cond_5
    invoke-virtual {v3}, Lvm3;->a()Lkotlinx/serialization/json/JsonObject;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-virtual {v1}, Lkotlinx/serialization/json/JsonObject;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    sget-object v3, Ll51;->c:Lq51;

    .line 166
    .line 167
    new-instance v9, Llv;

    .line 168
    .line 169
    invoke-direct {v9, v3, v1, v6}, Llv;-><init>(Lq51;Ljava/lang/String;I)V

    .line 170
    .line 171
    .line 172
    iput-object v7, v2, Lov;->A:Lio/github/jan/supabase/auth/user/UserInfo;

    .line 173
    .line 174
    iput-object v7, v2, Lov;->B:Lio/github/jan/supabase/auth/user/UserSession;

    .line 175
    .line 176
    move/from16 v1, p1

    .line 177
    .line 178
    iput-boolean v1, v2, Lov;->z:Z

    .line 179
    .line 180
    iput v6, v2, Lov;->E:I

    .line 181
    .line 182
    iget-object v3, v0, Lio/github/jan/supabase/auth/a;->m:Law;

    .line 183
    .line 184
    const-string v6, "user"

    .line 185
    .line 186
    invoke-virtual {v3, v6, v9, v2}, Li77;->a(Ljava/lang/String;Lvr2;Lh61;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    if-ne v3, v8, :cond_6

    .line 191
    .line 192
    goto/16 :goto_3

    .line 193
    .line 194
    :cond_6
    :goto_1
    check-cast v3, Lyl1;

    .line 195
    .line 196
    iput-object v7, v2, Lov;->A:Lio/github/jan/supabase/auth/user/UserInfo;

    .line 197
    .line 198
    iput-object v7, v2, Lov;->B:Lio/github/jan/supabase/auth/user/UserSession;

    .line 199
    .line 200
    iput-boolean v1, v2, Lov;->z:Z

    .line 201
    .line 202
    iput v5, v2, Lov;->E:I

    .line 203
    .line 204
    sget-object v5, Lmo0;->a:Ljava/nio/charset/Charset;

    .line 205
    .line 206
    invoke-static {v3, v5, v2}, Lh49;->q(Lyl1;Ljava/nio/charset/Charset;Lh61;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    if-ne v3, v8, :cond_7

    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_7
    move-object/from16 v22, v3

    .line 214
    .line 215
    move v3, v1

    .line 216
    move-object/from16 v1, v22

    .line 217
    .line 218
    :goto_2
    check-cast v1, Ljava/lang/String;

    .line 219
    .line 220
    :try_start_0
    sget-object v5, Ll18;->a:Lkm3;

    .line 221
    .line 222
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    sget-object v6, Lio/github/jan/supabase/auth/user/UserInfo;->Companion:Lav7;

    .line 226
    .line 227
    invoke-virtual {v6}, Lav7;->serializer()Lzr3;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    check-cast v6, Lzr3;

    .line 232
    .line 233
    invoke-virtual {v5, v6, v1}, Lpl3;->b(Lzr3;Ljava/lang/String;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v1
    :try_end_0
    .catch Lkotlinx/serialization/MissingFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 237
    move-object/from16 v17, v1

    .line 238
    .line 239
    check-cast v17, Lio/github/jan/supabase/auth/user/UserInfo;

    .line 240
    .line 241
    if-eqz v3, :cond_a

    .line 242
    .line 243
    iget-object v1, v0, Lio/github/jan/supabase/auth/a;->f:Lxw5;

    .line 244
    .line 245
    iget-object v5, v1, Lxw5;->w:Ld37;

    .line 246
    .line 247
    invoke-virtual {v5}, Ld37;->getValue()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    instance-of v5, v5, Lin6;

    .line 252
    .line 253
    if-eqz v5, :cond_a

    .line 254
    .line 255
    iget-object v1, v1, Lxw5;->w:Ld37;

    .line 256
    .line 257
    invoke-virtual {v1}, Ld37;->getValue()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    check-cast v1, Lin6;

    .line 265
    .line 266
    iget-object v9, v1, Lin6;->a:Lio/github/jan/supabase/auth/user/UserSession;

    .line 267
    .line 268
    const/16 v20, 0x1bf

    .line 269
    .line 270
    const/16 v21, 0x0

    .line 271
    .line 272
    const/4 v10, 0x0

    .line 273
    const/4 v11, 0x0

    .line 274
    const/4 v12, 0x0

    .line 275
    const/4 v13, 0x0

    .line 276
    const-wide/16 v14, 0x0

    .line 277
    .line 278
    const/16 v16, 0x0

    .line 279
    .line 280
    const/16 v18, 0x0

    .line 281
    .line 282
    const/16 v19, 0x0

    .line 283
    .line 284
    invoke-static/range {v9 .. v21}, Lio/github/jan/supabase/auth/user/UserSession;->copy$default(Lio/github/jan/supabase/auth/user/UserSession;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lio/github/jan/supabase/auth/user/UserInfo;Ljava/lang/String;Lqd3;ILjava/lang/Object;)Lio/github/jan/supabase/auth/user/UserSession;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    move-object/from16 v5, v17

    .line 289
    .line 290
    iget-object v6, v0, Lio/github/jan/supabase/auth/a;->c:Lwu;

    .line 291
    .line 292
    iget-boolean v6, v6, Lwu;->x:Z

    .line 293
    .line 294
    if-eqz v6, :cond_9

    .line 295
    .line 296
    iput-object v5, v2, Lov;->A:Lio/github/jan/supabase/auth/user/UserInfo;

    .line 297
    .line 298
    iput-object v1, v2, Lov;->B:Lio/github/jan/supabase/auth/user/UserSession;

    .line 299
    .line 300
    iput-boolean v3, v2, Lov;->z:Z

    .line 301
    .line 302
    iput v4, v2, Lov;->E:I

    .line 303
    .line 304
    iget-object v3, v0, Lio/github/jan/supabase/auth/a;->i:Lcf4;

    .line 305
    .line 306
    invoke-virtual {v3, v1, v2}, Lcf4;->C(Lio/github/jan/supabase/auth/user/UserSession;Lf61;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    if-ne v2, v8, :cond_8

    .line 311
    .line 312
    :goto_3
    return-object v8

    .line 313
    :cond_8
    move-object v3, v1

    .line 314
    move-object v2, v5

    .line 315
    :goto_4
    move-object/from16 v17, v2

    .line 316
    .line 317
    move-object v1, v3

    .line 318
    goto :goto_5

    .line 319
    :cond_9
    move-object/from16 v17, v5

    .line 320
    .line 321
    :goto_5
    new-instance v2, Lin6;

    .line 322
    .line 323
    new-instance v3, Lgn6;

    .line 324
    .line 325
    invoke-direct {v3, v1}, Lgn6;-><init>(Lio/github/jan/supabase/auth/user/UserSession;)V

    .line 326
    .line 327
    .line 328
    invoke-direct {v2, v1, v3}, Lin6;-><init>(Lio/github/jan/supabase/auth/user/UserSession;Lhn6;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v0, v2}, Lio/github/jan/supabase/auth/a;->u(Lmn6;)V

    .line 332
    .line 333
    .line 334
    return-object v17

    .line 335
    :cond_a
    move-object/from16 v5, v17

    .line 336
    .line 337
    return-object v5

    .line 338
    :catch_0
    new-instance v0, Lio/github/jan/supabase/exceptions/SupabaseEncodingException;

    .line 339
    .line 340
    const-class v2, Lio/github/jan/supabase/auth/user/UserInfo;

    .line 341
    .line 342
    sget-object v3, Lb26;->a:Lc26;

    .line 343
    .line 344
    invoke-virtual {v3, v2}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    invoke-interface {v2}, Lgq3;->A()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    const-string v3, "\n"

    .line 353
    .line 354
    const-string v4, ""

    .line 355
    .line 356
    invoke-static {v1, v3, v4}, Lk57;->s0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    new-instance v3, Ljava/lang/StringBuilder;

    .line 361
    .line 362
    const-string v4, "Couldn\'t decode payload as "

    .line 363
    .line 364
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    const-string v2, ". Input: "

    .line 371
    .line 372
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    throw v0
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
.end method

.method public final z(Ljava/lang/String;Ljava/lang/String;Lcb;Lh61;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p4, Lpv;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lpv;

    .line 7
    .line 8
    iget v1, v0, Lpv;->H:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lpv;->H:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lpv;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lpv;-><init>(Lio/github/jan/supabase/auth/a;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lpv;->F:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lpv;->H:I

    .line 28
    .line 29
    const/4 v2, 0x4

    .line 30
    const/4 v3, 0x3

    .line 31
    const/4 v4, 0x2

    .line 32
    const/4 v5, 0x1

    .line 33
    const/4 v6, 0x0

    .line 34
    sget-object v7, Lp81;->w:Lp81;

    .line 35
    .line 36
    if-eqz v1, :cond_5

    .line 37
    .line 38
    if-eq v1, v5, :cond_4

    .line 39
    .line 40
    if-eq v1, v4, :cond_3

    .line 41
    .line 42
    if-eq v1, v3, :cond_2

    .line 43
    .line 44
    if-ne v1, v2, :cond_1

    .line 45
    .line 46
    iget-object p0, v0, Lpv;->A:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Lio/github/jan/supabase/auth/user/UserSession;

    .line 49
    .line 50
    invoke-static {p4}, Lo85;->q(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_6

    .line 54
    .line 55
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v6

    .line 61
    :cond_2
    iget-object p0, v0, Lpv;->E:Ljava/lang/String;

    .line 62
    .line 63
    iget-object p1, v0, Lpv;->D:Lub4;

    .line 64
    .line 65
    iget-object p2, v0, Lpv;->C:Lms3;

    .line 66
    .line 67
    iget-object p3, v0, Lpv;->B:Ljava/lang/StringBuilder;

    .line 68
    .line 69
    iget-object v0, v0, Lpv;->A:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Lio/github/jan/supabase/auth/user/UserSession;

    .line 72
    .line 73
    invoke-static {p4}, Lo85;->q(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_4

    .line 77
    .line 78
    :cond_3
    iget-object p1, v0, Lpv;->A:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p1, Lj77;

    .line 81
    .line 82
    iget-object p2, v0, Lpv;->z:Lyl1;

    .line 83
    .line 84
    invoke-static {p4}, Lo85;->q(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    iget-object p1, v0, Lpv;->A:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast p1, Ljava/lang/String;

    .line 91
    .line 92
    iget-object p1, v0, Lpv;->z:Lyl1;

    .line 93
    .line 94
    check-cast p1, Ln77;

    .line 95
    .line 96
    invoke-static {p4}, Lo85;->q(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_5
    invoke-static {p4}, Lo85;->q(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    new-instance p4, Lvm3;

    .line 104
    .line 105
    invoke-direct {p4}, Lvm3;-><init>()V

    .line 106
    .line 107
    .line 108
    const-string v1, "type"

    .line 109
    .line 110
    invoke-static {p4, v1, p1}, Lb96;->M(Lvm3;Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    if-eqz p2, :cond_6

    .line 114
    .line 115
    const-string p1, "token"

    .line 116
    .line 117
    invoke-static {p4, p1, p2}, Lb96;->M(Lvm3;Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :cond_6
    invoke-virtual {p3, p4}, Lcb;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p4}, Lvm3;->a()Lkotlinx/serialization/json/JsonObject;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    sget-object p2, Ll51;->c:Lq51;

    .line 128
    .line 129
    new-instance p3, Ljv;

    .line 130
    .line 131
    invoke-direct {p3, p2, p1, v4}, Ljv;-><init>(Lq51;Lkotlinx/serialization/json/JsonObject;I)V

    .line 132
    .line 133
    .line 134
    iput-object v6, v0, Lpv;->z:Lyl1;

    .line 135
    .line 136
    iput-object v6, v0, Lpv;->A:Ljava/lang/Object;

    .line 137
    .line 138
    iput v5, v0, Lpv;->H:I

    .line 139
    .line 140
    iget-object p1, p0, Lio/github/jan/supabase/auth/a;->k:Law;

    .line 141
    .line 142
    const-string p2, "verify"

    .line 143
    .line 144
    invoke-virtual {p1, p2, p3, v0}, Li77;->a(Ljava/lang/String;Lvr2;Lh61;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p4

    .line 148
    if-ne p4, v7, :cond_7

    .line 149
    .line 150
    goto/16 :goto_5

    .line 151
    .line 152
    :cond_7
    :goto_1
    move-object p2, p4

    .line 153
    check-cast p2, Lyl1;

    .line 154
    .line 155
    iput-object p2, v0, Lpv;->z:Lyl1;

    .line 156
    .line 157
    iget-object p1, p0, Lio/github/jan/supabase/auth/a;->b:Lj77;

    .line 158
    .line 159
    iput-object p1, v0, Lpv;->A:Ljava/lang/Object;

    .line 160
    .line 161
    iput v4, v0, Lpv;->H:I

    .line 162
    .line 163
    sget-object p3, Lmo0;->a:Ljava/nio/charset/Charset;

    .line 164
    .line 165
    invoke-static {p2, p3, v0}, Lh49;->q(Lyl1;Ljava/nio/charset/Charset;Lh61;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p4

    .line 169
    if-ne p4, v7, :cond_8

    .line 170
    .line 171
    goto/16 :goto_5

    .line 172
    .line 173
    :cond_8
    :goto_2
    check-cast p4, Ljava/lang/String;

    .line 174
    .line 175
    :try_start_0
    sget-object p3, Ll18;->a:Lkm3;

    .line 176
    .line 177
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    sget-object v1, Lio/github/jan/supabase/auth/user/UserSession;->Companion:Lfy7;

    .line 181
    .line 182
    invoke-virtual {v1}, Lfy7;->serializer()Lzr3;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    check-cast v1, Lzr3;

    .line 187
    .line 188
    invoke-virtual {p3, v1, p4}, Lpl3;->b(Lzr3;Ljava/lang/String;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p1
    :try_end_0
    .catch Lkotlinx/serialization/SerializationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 192
    goto :goto_3

    .line 193
    :catch_0
    move-exception p3

    .line 194
    check-cast p1, Lm77;

    .line 195
    .line 196
    iget-object p1, p1, Lm77;->f:Lcf4;

    .line 197
    .line 198
    iget-object v1, p1, Lcf4;->z:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v1, Lms3;

    .line 201
    .line 202
    iget-object p1, p1, Lcf4;->y:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast p1, Ljava/lang/String;

    .line 205
    .line 206
    sget-object v4, Lub4;->x:Lub4;

    .line 207
    .line 208
    invoke-virtual {v1, v4}, Lms3;->a(Lub4;)Z

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    if-eqz v5, :cond_9

    .line 213
    .line 214
    new-instance v5, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    const-string v8, "Could not decode "

    .line 217
    .line 218
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    const/16 v8, 0xc8

    .line 222
    .line 223
    invoke-static {v8, p4}, Ld57;->i1(ILjava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p4

    .line 227
    invoke-virtual {v5, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    const-string p4, " as "

    .line 231
    .line 232
    invoke-virtual {v5, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    const-class p4, Lio/github/jan/supabase/auth/user/UserSession;

    .line 236
    .line 237
    sget-object v8, Lb26;->a:Lc26;

    .line 238
    .line 239
    invoke-virtual {v8, p4}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 240
    .line 241
    .line 242
    move-result-object p4

    .line 243
    invoke-interface {p4}, Lgq3;->A()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p4

    .line 247
    invoke-virtual {v5, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    const/16 p4, 0x2e

    .line 251
    .line 252
    invoke-virtual {v5, p4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p4

    .line 259
    invoke-virtual {v1, v4, p1, p3, p4}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    :cond_9
    move-object p1, v6

    .line 263
    :goto_3
    check-cast p1, Lio/github/jan/supabase/auth/user/UserSession;

    .line 264
    .line 265
    if-nez p1, :cond_c

    .line 266
    .line 267
    iget-object p0, p0, Lio/github/jan/supabase/auth/a;->d:Lcf4;

    .line 268
    .line 269
    iget-object p1, p0, Lcf4;->z:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast p1, Lms3;

    .line 272
    .line 273
    iget-object p0, p0, Lcf4;->y:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast p0, Ljava/lang/String;

    .line 276
    .line 277
    sget-object p3, Lub4;->w:Lub4;

    .line 278
    .line 279
    invoke-virtual {p1, p3}, Lms3;->a(Lub4;)Z

    .line 280
    .line 281
    .line 282
    move-result p4

    .line 283
    if-eqz p4, :cond_b

    .line 284
    .line 285
    const-string p4, "Received `verifyOtp` response without session: "

    .line 286
    .line 287
    invoke-static {p4}, Lb81;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    move-result-object p4

    .line 291
    iput-object v6, v0, Lpv;->z:Lyl1;

    .line 292
    .line 293
    iput-object v6, v0, Lpv;->A:Ljava/lang/Object;

    .line 294
    .line 295
    iput-object p4, v0, Lpv;->B:Ljava/lang/StringBuilder;

    .line 296
    .line 297
    iput-object p1, v0, Lpv;->C:Lms3;

    .line 298
    .line 299
    iput-object p3, v0, Lpv;->D:Lub4;

    .line 300
    .line 301
    iput-object p0, v0, Lpv;->E:Ljava/lang/String;

    .line 302
    .line 303
    iput v3, v0, Lpv;->H:I

    .line 304
    .line 305
    sget-object v1, Lmo0;->a:Ljava/nio/charset/Charset;

    .line 306
    .line 307
    invoke-static {p2, v1, v0}, Lh49;->q(Lyl1;Ljava/nio/charset/Charset;Lh61;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object p2

    .line 311
    if-ne p2, v7, :cond_a

    .line 312
    .line 313
    goto :goto_5

    .line 314
    :cond_a
    move-object v9, p2

    .line 315
    move-object p2, p1

    .line 316
    move-object p1, p3

    .line 317
    move-object p3, p4

    .line 318
    move-object p4, v9

    .line 319
    :goto_4
    check-cast p4, Ljava/lang/String;

    .line 320
    .line 321
    const-string v0, ". This may occur if changing the email with \'Secure email change\' enabled"

    .line 322
    .line 323
    invoke-static {p3, p4, v0}, Lf21;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object p3

    .line 327
    invoke-virtual {p2, p1, p0, v6, p3}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    :cond_b
    sget-object p0, Le85;->a:Le85;

    .line 331
    .line 332
    return-object p0

    .line 333
    :cond_c
    new-instance p2, Ldn6;

    .line 334
    .line 335
    sget-object p3, Ln25;->a:Ln25;

    .line 336
    .line 337
    invoke-direct {p2, p3}, Ldn6;-><init>(Lsv;)V

    .line 338
    .line 339
    .line 340
    iput-object v6, v0, Lpv;->z:Lyl1;

    .line 341
    .line 342
    iput-object p1, v0, Lpv;->A:Ljava/lang/Object;

    .line 343
    .line 344
    iput v2, v0, Lpv;->H:I

    .line 345
    .line 346
    invoke-static {p0, p1, p2, v0}, Luu;->c(Luu;Lio/github/jan/supabase/auth/user/UserSession;Lhn6;Lh61;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object p0

    .line 350
    if-ne p0, v7, :cond_d

    .line 351
    .line 352
    :goto_5
    return-object v7

    .line 353
    :cond_d
    move-object p0, p1

    .line 354
    :goto_6
    new-instance p1, Ld85;

    .line 355
    .line 356
    invoke-direct {p1, p0}, Ld85;-><init>(Lio/github/jan/supabase/auth/user/UserSession;)V

    .line 357
    .line 358
    .line 359
    return-object p1
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
.end method
