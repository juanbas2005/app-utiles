.class public final Lih4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Luy3;

.field public final b:Lwr0;

.field public c:Z

.field public d:Z

.field public final e:Lhv2;

.field public final f:Leq4;

.field public final g:J

.field public final h:Leq4;

.field public i:Lk31;


# direct methods
.method public constructor <init>(Luy3;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lih4;->a:Luy3;

    .line 5
    .line 6
    new-instance p1, Lwr0;

    .line 7
    .line 8
    const/16 v0, 0x11

    .line 9
    .line 10
    invoke-direct {p1, v0}, Lwr0;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lih4;->b:Lwr0;

    .line 14
    .line 15
    new-instance p1, Lhv2;

    .line 16
    .line 17
    const/16 v0, 0x17

    .line 18
    .line 19
    invoke-direct {p1, v0}, Lhv2;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lih4;->e:Lhv2;

    .line 23
    .line 24
    new-instance p1, Leq4;

    .line 25
    .line 26
    const/16 v0, 0x10

    .line 27
    .line 28
    new-array v1, v0, [Luy3;

    .line 29
    .line 30
    invoke-direct {p1, v1}, Leq4;-><init>([Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lih4;->f:Leq4;

    .line 34
    .line 35
    const-wide/16 v1, 0x1

    .line 36
    .line 37
    iput-wide v1, p0, Lih4;->g:J

    .line 38
    .line 39
    new-instance p1, Leq4;

    .line 40
    .line 41
    new-array v0, v0, [Lhh4;

    .line 42
    .line 43
    invoke-direct {p1, v0}, Leq4;-><init>([Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lih4;->h:Leq4;

    .line 47
    .line 48
    return-void
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

.method public static final a(Lih4;Luy3;Z)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lih4;->a:Luy3;

    .line 2
    .line 3
    iget-boolean v1, p1, Luy3;->j0:Z

    .line 4
    .line 5
    iget-object v2, p1, Luy3;->b0:Lyy3;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_4

    .line 11
    .line 12
    :cond_0
    invoke-static {p1}, Lih4;->k(Luy3;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_d

    .line 17
    .line 18
    if-ne p1, v0, :cond_1

    .line 19
    .line 20
    iget-object v1, p0, Lih4;->i:Lk31;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v1, 0x0

    .line 27
    :goto_0
    if-eqz p2, :cond_4

    .line 28
    .line 29
    iget-boolean p2, v2, Lyy3;->e:Z

    .line 30
    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    invoke-static {p1, v1}, Lih4;->c(Luy3;Lk31;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    :cond_2
    if-nez v3, :cond_3

    .line 38
    .line 39
    iget-boolean p2, v2, Lyy3;->f:Z

    .line 40
    .line 41
    if-eqz p2, :cond_c

    .line 42
    .line 43
    :cond_3
    invoke-virtual {p1}, Luy3;->L()Ljava/lang/Boolean;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-static {p2, v0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    if-eqz p2, :cond_c

    .line 54
    .line 55
    invoke-virtual {p1}, Luy3;->M()V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_3

    .line 59
    .line 60
    :cond_4
    invoke-virtual {p1}, Luy3;->q()Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-eqz p2, :cond_5

    .line 65
    .line 66
    invoke-static {p1, v1}, Lih4;->d(Luy3;Lk31;)Z

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    goto :goto_1

    .line 71
    :cond_5
    move p2, v3

    .line 72
    :goto_1
    invoke-virtual {p1}, Luy3;->p()Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_b

    .line 77
    .line 78
    const/4 v1, 0x1

    .line 79
    if-eq p1, v0, :cond_6

    .line 80
    .line 81
    invoke-virtual {p1}, Luy3;->v()Luy3;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    if-eqz v4, :cond_b

    .line 86
    .line 87
    invoke-virtual {v4}, Luy3;->K()Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-ne v4, v1, :cond_b

    .line 92
    .line 93
    iget-object v4, v2, Lyy3;->p:Lkh4;

    .line 94
    .line 95
    iget-boolean v4, v4, Lkh4;->P:Z

    .line 96
    .line 97
    if-eqz v4, :cond_b

    .line 98
    .line 99
    :cond_6
    if-ne p1, v0, :cond_a

    .line 100
    .line 101
    iget-object v0, p1, Luy3;->X:Lsy3;

    .line 102
    .line 103
    sget-object v4, Lsy3;->y:Lsy3;

    .line 104
    .line 105
    if-ne v0, v4, :cond_7

    .line 106
    .line 107
    invoke-virtual {p1}, Luy3;->f()V

    .line 108
    .line 109
    .line 110
    :cond_7
    invoke-virtual {p1}, Luy3;->v()Luy3;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    if-eqz v0, :cond_8

    .line 115
    .line 116
    iget-object v0, v0, Luy3;->a0:Lo00;

    .line 117
    .line 118
    iget-object v0, v0, Lo00;->d:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v0, Lhc3;

    .line 121
    .line 122
    if-eqz v0, :cond_8

    .line 123
    .line 124
    iget-object v0, v0, Ldd4;->L:Led4;

    .line 125
    .line 126
    if-nez v0, :cond_9

    .line 127
    .line 128
    :cond_8
    invoke-static {p1}, Lxy3;->a(Luy3;)Lp95;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    check-cast v0, Lje;

    .line 133
    .line 134
    invoke-virtual {v0}, Lje;->getPlacementScope()Ldh5;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    :cond_9
    iget-object v2, v2, Lyy3;->p:Lkh4;

    .line 139
    .line 140
    invoke-static {v0, v2, v3, v3}, Ldh5;->k(Ldh5;Leh5;II)V

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_a
    invoke-virtual {p1}, Luy3;->V()V

    .line 145
    .line 146
    .line 147
    :goto_2
    iget-object v0, p0, Lih4;->e:Lhv2;

    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    iget v2, p1, Luy3;->i0:I

    .line 153
    .line 154
    if-lez v2, :cond_b

    .line 155
    .line 156
    iget-object v0, v0, Lhv2;->y:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, Leq4;

    .line 159
    .line 160
    invoke-virtual {v0, p1}, Leq4;->b(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    iput-boolean v1, p1, Luy3;->h0:Z

    .line 164
    .line 165
    :cond_b
    move v3, p2

    .line 166
    :cond_c
    :goto_3
    invoke-virtual {p0}, Lih4;->e()V

    .line 167
    .line 168
    .line 169
    :cond_d
    :goto_4
    return v3
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

.method public static c(Luy3;Lk31;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Luy3;->D:Luy3;

    .line 2
    .line 3
    iget-object v1, p0, Luy3;->b0:Lyy3;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    if-eqz p1, :cond_2

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, v1, Lyy3;->q:Ljd4;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-wide v3, p1, Lk31;->a:J

    .line 19
    .line 20
    invoke-virtual {v0, v3, v4}, Ljd4;->G0(J)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move p1, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_2
    iget-object p1, v1, Lyy3;->q:Ljd4;

    .line 28
    .line 29
    if-eqz p1, :cond_3

    .line 30
    .line 31
    iget-object v1, p1, Ljd4;->J:Lk31;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    const/4 v1, 0x0

    .line 35
    :goto_0
    if-eqz v1, :cond_1

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-wide v0, v1, Lk31;->a:J

    .line 43
    .line 44
    invoke-virtual {p1, v0, v1}, Ljd4;->G0(J)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    :goto_1
    invoke-virtual {p0}, Luy3;->v()Luy3;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz p1, :cond_6

    .line 53
    .line 54
    if-eqz v0, :cond_6

    .line 55
    .line 56
    iget-object v1, v0, Luy3;->D:Luy3;

    .line 57
    .line 58
    const/4 v3, 0x3

    .line 59
    if-nez v1, :cond_4

    .line 60
    .line 61
    invoke-static {v0, v2, v3}, Luy3;->Z(Luy3;ZI)V

    .line 62
    .line 63
    .line 64
    return p1

    .line 65
    :cond_4
    invoke-virtual {p0}, Luy3;->t()Lsy3;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    sget-object v4, Lsy3;->w:Lsy3;

    .line 70
    .line 71
    if-ne v1, v4, :cond_5

    .line 72
    .line 73
    invoke-static {v0, v2, v3}, Luy3;->X(Luy3;ZI)V

    .line 74
    .line 75
    .line 76
    return p1

    .line 77
    :cond_5
    invoke-virtual {p0}, Luy3;->t()Lsy3;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    sget-object v1, Lsy3;->x:Lsy3;

    .line 82
    .line 83
    if-ne p0, v1, :cond_6

    .line 84
    .line 85
    invoke-virtual {v0, v2}, Luy3;->W(Z)V

    .line 86
    .line 87
    .line 88
    :cond_6
    return p1
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
.end method

.method public static d(Luy3;Lk31;)Z
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Luy3;->R(Lk31;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {p0}, Luy3;->S(Luy3;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    :goto_0
    invoke-virtual {p0}, Luy3;->v()Luy3;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0}, Luy3;->s()Lsy3;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    sget-object v2, Lsy3;->w:Lsy3;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    if-ne v1, v2, :cond_1

    .line 28
    .line 29
    const/4 p0, 0x3

    .line 30
    invoke-static {v0, v3, p0}, Luy3;->Z(Luy3;ZI)V

    .line 31
    .line 32
    .line 33
    return p1

    .line 34
    :cond_1
    invoke-virtual {p0}, Luy3;->s()Lsy3;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    sget-object v1, Lsy3;->x:Lsy3;

    .line 39
    .line 40
    if-ne p0, v1, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0, v3}, Luy3;->Y(Z)V

    .line 43
    .line 44
    .line 45
    :cond_2
    return p1
    .line 46
    .line 47
.end method

.method public static i(Luy3;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Luy3;->b0:Lyy3;

    .line 2
    .line 3
    iget-boolean v0, v0, Lyy3;->e:Z

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Luy3;->t()Lsy3;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Lsy3;->y:Lsy3;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Luy3;->b0:Lyy3;

    .line 17
    .line 18
    iget-object p0, p0, Lyy3;->q:Ljd4;

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    iget-object p0, p0, Ljd4;->N:Lvy3;

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Lvy3;->e()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-ne p0, v2, :cond_1

    .line 31
    .line 32
    :cond_0
    return v2

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return p0
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

.method public static j(Luy3;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Luy3;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0}, Luy3;->s()Lsy3;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Lsy3;->y:Lsy3;

    .line 12
    .line 13
    if-ne v0, v1, :cond_2

    .line 14
    .line 15
    iget-object v0, p0, Luy3;->b0:Lyy3;

    .line 16
    .line 17
    iget-object v0, v0, Lyy3;->p:Lkh4;

    .line 18
    .line 19
    iget-object v0, v0, Lkh4;->T:Lvy3;

    .line 20
    .line 21
    invoke-virtual {v0}, Lvy3;->e()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, Luy3;->v()Luy3;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v0, v0, Luy3;->b0:Lyy3;

    .line 34
    .line 35
    iget-object v0, v0, Lyy3;->d:Lqy3;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v0, 0x0

    .line 39
    :goto_0
    sget-object v1, Lqy3;->w:Lqy3;

    .line 40
    .line 41
    if-ne v0, v1, :cond_4

    .line 42
    .line 43
    :cond_2
    invoke-virtual {p0}, Luy3;->v()Luy3;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-nez p0, :cond_3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    invoke-virtual {p0}, Luy3;->K()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    const/4 p0, 0x1

    .line 57
    return p0

    .line 58
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 59
    return p0
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

.method public static k(Luy3;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Luy3;->b0:Lyy3;

    .line 2
    .line 3
    invoke-virtual {p0}, Luy3;->K()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    iget-object v1, v0, Lyy3;->p:Lkh4;

    .line 11
    .line 12
    iget-boolean v1, v1, Lkh4;->P:Z

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    invoke-static {p0}, Lih4;->j(Luy3;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Luy3;->L()Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    invoke-static {p0}, Lih4;->i(Luy3;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    iget-object p0, v0, Lyy3;->p:Lkh4;

    .line 41
    .line 42
    iget-object p0, p0, Lkh4;->T:Lvy3;

    .line 43
    .line 44
    invoke-virtual {p0}, Lvy3;->e()Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_1

    .line 49
    .line 50
    iget-object p0, v0, Lyy3;->q:Ljd4;

    .line 51
    .line 52
    if-eqz p0, :cond_0

    .line 53
    .line 54
    iget-object p0, p0, Ljd4;->N:Lvy3;

    .line 55
    .line 56
    if-eqz p0, :cond_0

    .line 57
    .line 58
    invoke-virtual {p0}, Lvy3;->e()Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-ne p0, v2, :cond_0

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    const/4 p0, 0x0

    .line 66
    return p0

    .line 67
    :cond_1
    :goto_0
    return v2
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


# virtual methods
.method public final b(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lih4;->e:Lhv2;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, v0, Lhv2;->y:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Leq4;

    .line 8
    .line 9
    iget-object p0, p0, Lih4;->a:Luy3;

    .line 10
    .line 11
    iget v1, p0, Luy3;->i0:I

    .line 12
    .line 13
    if-lez v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Leq4;->g()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p0}, Leq4;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, Luy3;->h0:Z

    .line 23
    .line 24
    :cond_0
    iget-object p0, v0, Lhv2;->y:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Leq4;

    .line 27
    .line 28
    iget p0, p0, Leq4;->y:I

    .line 29
    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    const-string p0, "Compose:onPositionedCallbacks"

    .line 33
    .line 34
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :try_start_0
    invoke-virtual {v0}, Lhv2;->x0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 46
    .line 47
    .line 48
    throw p0

    .line 49
    :cond_1
    return-void
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

.method public final e()V
    .locals 7

    .line 1
    iget-object p0, p0, Lih4;->h:Leq4;

    .line 2
    .line 3
    iget v0, p0, Leq4;->y:I

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-object v1, p0, Leq4;->w:[Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v0, :cond_2

    .line 11
    .line 12
    aget-object v3, v1, v2

    .line 13
    .line 14
    check-cast v3, Lhh4;

    .line 15
    .line 16
    iget-object v4, v3, Lhh4;->a:Luy3;

    .line 17
    .line 18
    invoke-virtual {v4}, Luy3;->J()Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    iget-boolean v4, v3, Lhh4;->b:Z

    .line 25
    .line 26
    iget-object v5, v3, Lhh4;->a:Luy3;

    .line 27
    .line 28
    iget-boolean v3, v3, Lhh4;->c:Z

    .line 29
    .line 30
    const/4 v6, 0x2

    .line 31
    if-nez v4, :cond_0

    .line 32
    .line 33
    invoke-static {v5, v3, v6}, Luy3;->Z(Luy3;ZI)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-static {v5, v3, v6}, Luy3;->X(Luy3;ZI)V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-virtual {p0}, Leq4;->g()V

    .line 44
    .line 45
    .line 46
    :cond_3
    return-void
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

.method public final f(Luy3;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Luy3;->z()Leq4;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, Leq4;->w:[Ljava/lang/Object;

    .line 6
    .line 7
    iget p1, p1, Leq4;->y:I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, p1, :cond_2

    .line 11
    .line 12
    aget-object v2, v0, v1

    .line 13
    .line 14
    check-cast v2, Luy3;

    .line 15
    .line 16
    invoke-virtual {v2}, Luy3;->L()Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-static {v3, v4}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    iget-boolean v3, v2, Luy3;->j0:Z

    .line 29
    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    iget-object v3, p0, Lih4;->b:Lwr0;

    .line 33
    .line 34
    invoke-virtual {v3, v2}, Lwr0;->t(Luy3;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    invoke-virtual {v2}, Luy3;->M()V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-virtual {p0, v2}, Lih4;->f(Luy3;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    return-void
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

.method public final g(Luy3;Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lih4;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "forceMeasureTheSubtree should be executed during the measureAndLayout pass"

    .line 6
    .line 7
    invoke-static {v0}, Lyb3;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    if-eqz p2, :cond_1

    .line 11
    .line 12
    iget-object v0, p1, Luy3;->b0:Lyy3;

    .line 13
    .line 14
    iget-boolean v0, v0, Lyy3;->e:Z

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {p1}, Luy3;->q()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    :goto_0
    if-eqz v0, :cond_2

    .line 22
    .line 23
    const-string v0, "node not yet measured"

    .line 24
    .line 25
    invoke-static {v0}, Lyb3;->a(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    invoke-virtual {p0, p1, p2}, Lih4;->h(Luy3;Z)V

    .line 29
    .line 30
    .line 31
    return-void
    .line 32
    .line 33
    .line 34
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
.end method

.method public final h(Luy3;Z)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Luy3;->z()Leq4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Leq4;->w:[Ljava/lang/Object;

    .line 6
    .line 7
    iget v0, v0, Leq4;->y:I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v0, :cond_8

    .line 11
    .line 12
    aget-object v3, v1, v2

    .line 13
    .line 14
    check-cast v3, Luy3;

    .line 15
    .line 16
    sget-object v4, Lsy3;->w:Lsy3;

    .line 17
    .line 18
    const/4 v5, 0x1

    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v3}, Luy3;->s()Lsy3;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    if-eq v6, v4, :cond_1

    .line 26
    .line 27
    iget-object v6, v3, Luy3;->b0:Lyy3;

    .line 28
    .line 29
    iget-object v6, v6, Lyy3;->p:Lkh4;

    .line 30
    .line 31
    iget-object v6, v6, Lkh4;->T:Lvy3;

    .line 32
    .line 33
    invoke-virtual {v6}, Lvy3;->e()Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-eqz v6, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    if-eqz p2, :cond_7

    .line 41
    .line 42
    invoke-virtual {v3}, Luy3;->t()Lsy3;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    if-eq v6, v4, :cond_1

    .line 47
    .line 48
    iget-object v4, v3, Luy3;->b0:Lyy3;

    .line 49
    .line 50
    iget-object v4, v4, Lyy3;->q:Ljd4;

    .line 51
    .line 52
    if-eqz v4, :cond_7

    .line 53
    .line 54
    iget-object v4, v4, Ljd4;->N:Lvy3;

    .line 55
    .line 56
    if-eqz v4, :cond_7

    .line 57
    .line 58
    invoke-virtual {v4}, Lvy3;->e()Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-ne v4, v5, :cond_7

    .line 63
    .line 64
    :cond_1
    :goto_1
    invoke-static {v3}, Lwe;->B(Luy3;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    iget-object v6, v3, Luy3;->b0:Lyy3;

    .line 69
    .line 70
    if-eqz v4, :cond_3

    .line 71
    .line 72
    if-nez p2, :cond_3

    .line 73
    .line 74
    iget-boolean v4, v6, Lyy3;->e:Z

    .line 75
    .line 76
    if-eqz v4, :cond_2

    .line 77
    .line 78
    iget-object v4, p0, Lih4;->b:Lwr0;

    .line 79
    .line 80
    invoke-virtual {v4, v3}, Lwr0;->t(Luy3;)Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-eqz v4, :cond_2

    .line 85
    .line 86
    invoke-virtual {p0, v3, v5}, Lih4;->o(Luy3;Z)Z

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_2
    invoke-virtual {p0, v3, v5}, Lih4;->g(Luy3;Z)V

    .line 91
    .line 92
    .line 93
    :cond_3
    :goto_2
    if-eqz p2, :cond_4

    .line 94
    .line 95
    iget-boolean v4, v6, Lyy3;->e:Z

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_4
    invoke-virtual {v3}, Luy3;->q()Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    :goto_3
    if-eqz v4, :cond_5

    .line 103
    .line 104
    invoke-virtual {p0, v3, p2}, Lih4;->o(Luy3;Z)Z

    .line 105
    .line 106
    .line 107
    :cond_5
    if-eqz p2, :cond_6

    .line 108
    .line 109
    iget-boolean v4, v6, Lyy3;->e:Z

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_6
    invoke-virtual {v3}, Luy3;->q()Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    :goto_4
    if-nez v4, :cond_7

    .line 117
    .line 118
    invoke-virtual {p0, v3, p2}, Lih4;->h(Luy3;Z)V

    .line 119
    .line 120
    .line 121
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_8
    if-eqz p2, :cond_9

    .line 125
    .line 126
    iget-object v0, p1, Luy3;->b0:Lyy3;

    .line 127
    .line 128
    iget-boolean v0, v0, Lyy3;->e:Z

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_9
    invoke-virtual {p1}, Luy3;->q()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    :goto_5
    if-eqz v0, :cond_a

    .line 136
    .line 137
    invoke-virtual {p0, p1, p2}, Lih4;->o(Luy3;Z)Z

    .line 138
    .line 139
    .line 140
    :cond_a
    return-void
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
.end method

.method public final l(Lsr2;)Z
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lih4;->b:Lwr0;

    .line 4
    .line 5
    iget-object v2, v1, Lih4;->a:Luy3;

    .line 6
    .line 7
    invoke-virtual {v2}, Luy3;->J()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    const-string v3, "performMeasureAndLayout called with unattached root"

    .line 14
    .line 15
    invoke-static {v3}, Lyb3;->a(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {v2}, Luy3;->K()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_1

    .line 23
    .line 24
    const-string v3, "performMeasureAndLayout called with unplaced root"

    .line 25
    .line 26
    invoke-static {v3}, Lyb3;->a(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-boolean v3, v1, Lih4;->c:Z

    .line 30
    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    const-string v3, "performMeasureAndLayout called during measure layout"

    .line 34
    .line 35
    invoke-static {v3}, Lyb3;->a(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    iget-object v3, v1, Lih4;->i:Lk31;

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    const/4 v5, 0x1

    .line 42
    if-eqz v3, :cond_e

    .line 43
    .line 44
    iput-boolean v5, v1, Lih4;->c:Z

    .line 45
    .line 46
    iput-boolean v5, v1, Lih4;->d:Z

    .line 47
    .line 48
    :try_start_0
    invoke-virtual {v0}, Lwr0;->T()Z

    .line 49
    .line 50
    .line 51
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    iget-object v6, v0, Lwr0;->x:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v6, Lji8;

    .line 55
    .line 56
    if-eqz v3, :cond_c

    .line 57
    .line 58
    move v3, v4

    .line 59
    :cond_3
    :goto_0
    :try_start_1
    iget-object v7, v0, Lwr0;->z:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v7, Lji8;

    .line 62
    .line 63
    iget-object v8, v0, Lwr0;->y:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v8, Lji8;

    .line 66
    .line 67
    iget-object v9, v6, Lji8;->x:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v9, Lmy6;

    .line 70
    .line 71
    invoke-virtual {v9}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    if-nez v9, :cond_5

    .line 76
    .line 77
    iget-object v7, v6, Lji8;->x:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v7, Lmy6;

    .line 80
    .line 81
    invoke-virtual {v7}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    check-cast v7, Luy3;

    .line 86
    .line 87
    invoke-virtual {v6, v7}, Lji8;->C(Luy3;)Z

    .line 88
    .line 89
    .line 90
    iget-object v8, v7, Luy3;->D:Luy3;

    .line 91
    .line 92
    if-eqz v8, :cond_4

    .line 93
    .line 94
    move v8, v5

    .line 95
    goto :goto_1

    .line 96
    :cond_4
    move v8, v4

    .line 97
    :goto_1
    move v9, v4

    .line 98
    goto :goto_3

    .line 99
    :catchall_0
    move-exception v0

    .line 100
    goto/16 :goto_6

    .line 101
    .line 102
    :cond_5
    iget-object v9, v8, Lji8;->x:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v9, Lmy6;

    .line 105
    .line 106
    invoke-virtual {v9}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    if-nez v9, :cond_7

    .line 111
    .line 112
    iget-object v7, v8, Lji8;->x:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v7, Lmy6;

    .line 115
    .line 116
    invoke-virtual {v7}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    check-cast v7, Luy3;

    .line 121
    .line 122
    invoke-virtual {v8, v7}, Lji8;->C(Luy3;)Z

    .line 123
    .line 124
    .line 125
    iget-object v8, v7, Luy3;->D:Luy3;

    .line 126
    .line 127
    if-eqz v8, :cond_6

    .line 128
    .line 129
    move v8, v5

    .line 130
    goto :goto_2

    .line 131
    :cond_6
    move v8, v4

    .line 132
    :goto_2
    move v9, v5

    .line 133
    goto :goto_3

    .line 134
    :cond_7
    iget-object v8, v7, Lji8;->x:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v8, Lmy6;

    .line 137
    .line 138
    invoke-virtual {v8}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    if-nez v8, :cond_b

    .line 143
    .line 144
    iget-object v8, v7, Lji8;->x:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v8, Lmy6;

    .line 147
    .line 148
    invoke-virtual {v8}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    check-cast v8, Luy3;

    .line 153
    .line 154
    invoke-virtual {v7, v8}, Lji8;->C(Luy3;)Z

    .line 155
    .line 156
    .line 157
    move v9, v5

    .line 158
    move-object v7, v8

    .line 159
    move v8, v4

    .line 160
    :goto_3
    if-eqz v9, :cond_8

    .line 161
    .line 162
    invoke-static {v1, v7, v8}, Lih4;->a(Lih4;Luy3;Z)Z

    .line 163
    .line 164
    .line 165
    move-result v8

    .line 166
    goto :goto_4

    .line 167
    :cond_8
    invoke-virtual {v1, v7, v8}, Lih4;->o(Luy3;Z)Z

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    iget-object v9, v7, Luy3;->b0:Lyy3;

    .line 172
    .line 173
    iget-boolean v9, v9, Lyy3;->f:Z

    .line 174
    .line 175
    if-eqz v9, :cond_9

    .line 176
    .line 177
    sget-object v9, Lbh3;->x:Lbh3;

    .line 178
    .line 179
    invoke-virtual {v0, v7, v9}, Lwr0;->k(Luy3;Lbh3;)V

    .line 180
    .line 181
    .line 182
    :cond_9
    invoke-virtual {v7}, Luy3;->p()Z

    .line 183
    .line 184
    .line 185
    move-result v9

    .line 186
    if-eqz v9, :cond_a

    .line 187
    .line 188
    sget-object v9, Lbh3;->z:Lbh3;

    .line 189
    .line 190
    invoke-virtual {v0, v7, v9}, Lwr0;->k(Luy3;Lbh3;)V

    .line 191
    .line 192
    .line 193
    :cond_a
    :goto_4
    if-ne v7, v2, :cond_3

    .line 194
    .line 195
    if-eqz v8, :cond_3

    .line 196
    .line 197
    move v3, v5

    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :cond_b
    if-eqz p1, :cond_d

    .line 201
    .line 202
    invoke-interface/range {p1 .. p1}, Lsr2;->b()Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 203
    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_c
    move v3, v4

    .line 207
    :cond_d
    :goto_5
    iput-boolean v4, v1, Lih4;->c:Z

    .line 208
    .line 209
    iput-boolean v4, v1, Lih4;->d:Z

    .line 210
    .line 211
    goto :goto_7

    .line 212
    :goto_6
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 213
    :catchall_1
    move-exception v0

    .line 214
    iput-boolean v4, v1, Lih4;->c:Z

    .line 215
    .line 216
    iput-boolean v4, v1, Lih4;->d:Z

    .line 217
    .line 218
    throw v0

    .line 219
    :cond_e
    move v3, v4

    .line 220
    :goto_7
    iget-object v0, v1, Lih4;->f:Leq4;

    .line 221
    .line 222
    iget-object v1, v0, Leq4;->w:[Ljava/lang/Object;

    .line 223
    .line 224
    iget v2, v0, Leq4;->y:I

    .line 225
    .line 226
    move v6, v4

    .line 227
    :goto_8
    if-ge v6, v2, :cond_1a

    .line 228
    .line 229
    aget-object v7, v1, v6

    .line 230
    .line 231
    check-cast v7, Luy3;

    .line 232
    .line 233
    iget-object v7, v7, Luy3;->a0:Lo00;

    .line 234
    .line 235
    iget-object v8, v7, Lo00;->d:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v8, Lhc3;

    .line 238
    .line 239
    const/high16 v9, 0x400000

    .line 240
    .line 241
    invoke-static {v9}, Lyz4;->g(I)Z

    .line 242
    .line 243
    .line 244
    move-result v10

    .line 245
    if-eqz v10, :cond_f

    .line 246
    .line 247
    iget-object v11, v8, Lhc3;->r0:Lib7;

    .line 248
    .line 249
    goto :goto_9

    .line 250
    :cond_f
    iget-object v11, v8, Lhc3;->r0:Lib7;

    .line 251
    .line 252
    iget-object v11, v11, Lll4;->A:Lll4;

    .line 253
    .line 254
    if-nez v11, :cond_10

    .line 255
    .line 256
    goto/16 :goto_10

    .line 257
    .line 258
    :cond_10
    :goto_9
    sget-object v12, Lxz4;->m0:Ll76;

    .line 259
    .line 260
    invoke-virtual {v8, v10}, Lxz4;->e1(Z)Lll4;

    .line 261
    .line 262
    .line 263
    move-result-object v8

    .line 264
    :goto_a
    if-eqz v8, :cond_19

    .line 265
    .line 266
    iget v10, v8, Lll4;->z:I

    .line 267
    .line 268
    and-int/2addr v10, v9

    .line 269
    if-eqz v10, :cond_19

    .line 270
    .line 271
    iget v10, v8, Lll4;->y:I

    .line 272
    .line 273
    and-int/2addr v10, v9

    .line 274
    if-eqz v10, :cond_18

    .line 275
    .line 276
    const/4 v10, 0x0

    .line 277
    move-object v12, v8

    .line 278
    move-object v13, v10

    .line 279
    :goto_b
    if-eqz v12, :cond_18

    .line 280
    .line 281
    instance-of v14, v12, Lby3;

    .line 282
    .line 283
    if-eqz v14, :cond_11

    .line 284
    .line 285
    check-cast v12, Lby3;

    .line 286
    .line 287
    iget-object v14, v7, Lo00;->d:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v14, Lhc3;

    .line 290
    .line 291
    invoke-interface {v12, v14}, Lby3;->l(Ldy3;)V

    .line 292
    .line 293
    .line 294
    goto :goto_f

    .line 295
    :cond_11
    iget v14, v12, Lll4;->y:I

    .line 296
    .line 297
    and-int/2addr v14, v9

    .line 298
    if-eqz v14, :cond_17

    .line 299
    .line 300
    instance-of v14, v12, Lwo1;

    .line 301
    .line 302
    if-eqz v14, :cond_17

    .line 303
    .line 304
    move-object v14, v12

    .line 305
    check-cast v14, Lwo1;

    .line 306
    .line 307
    iget-object v14, v14, Lwo1;->L:Lll4;

    .line 308
    .line 309
    move v15, v4

    .line 310
    :goto_c
    if-eqz v14, :cond_16

    .line 311
    .line 312
    iget v4, v14, Lll4;->y:I

    .line 313
    .line 314
    and-int/2addr v4, v9

    .line 315
    if-eqz v4, :cond_15

    .line 316
    .line 317
    add-int/lit8 v15, v15, 0x1

    .line 318
    .line 319
    if-ne v15, v5, :cond_12

    .line 320
    .line 321
    move-object v12, v14

    .line 322
    goto :goto_d

    .line 323
    :cond_12
    if-nez v13, :cond_13

    .line 324
    .line 325
    new-instance v13, Leq4;

    .line 326
    .line 327
    const/16 v4, 0x10

    .line 328
    .line 329
    new-array v4, v4, [Lll4;

    .line 330
    .line 331
    invoke-direct {v13, v4}, Leq4;-><init>([Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    :cond_13
    if-eqz v12, :cond_14

    .line 335
    .line 336
    invoke-virtual {v13, v12}, Leq4;->b(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    move-object v12, v10

    .line 340
    :cond_14
    invoke-virtual {v13, v14}, Leq4;->b(Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    :cond_15
    :goto_d
    iget-object v14, v14, Lll4;->B:Lll4;

    .line 344
    .line 345
    const/4 v4, 0x0

    .line 346
    goto :goto_c

    .line 347
    :cond_16
    if-ne v15, v5, :cond_17

    .line 348
    .line 349
    :goto_e
    const/4 v4, 0x0

    .line 350
    goto :goto_b

    .line 351
    :cond_17
    :goto_f
    invoke-static {v13}, Lrc9;->j(Leq4;)Lll4;

    .line 352
    .line 353
    .line 354
    move-result-object v12

    .line 355
    goto :goto_e

    .line 356
    :cond_18
    if-eq v8, v11, :cond_19

    .line 357
    .line 358
    iget-object v8, v8, Lll4;->B:Lll4;

    .line 359
    .line 360
    const/4 v4, 0x0

    .line 361
    goto :goto_a

    .line 362
    :cond_19
    :goto_10
    add-int/lit8 v6, v6, 0x1

    .line 363
    .line 364
    const/4 v4, 0x0

    .line 365
    goto/16 :goto_8

    .line 366
    .line 367
    :cond_1a
    invoke-virtual {v0}, Leq4;->g()V

    .line 368
    .line 369
    .line 370
    return v3
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
.end method

.method public final m(Luy3;J)V
    .locals 12

    .line 1
    iget-boolean v0, p1, Luy3;->j0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lih4;->a:Luy3;

    .line 7
    .line 8
    if-eq p1, v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    const-string v1, "measureAndLayout called on root"

    .line 12
    .line 13
    invoke-static {v1}, Lyb3;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-virtual {v0}, Luy3;->J()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    const-string v1, "performMeasureAndLayout called with unattached root"

    .line 23
    .line 24
    invoke-static {v1}, Lyb3;->a(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_2
    invoke-virtual {v0}, Luy3;->K()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    const-string v0, "performMeasureAndLayout called with unplaced root"

    .line 34
    .line 35
    invoke-static {v0}, Lyb3;->a(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_3
    iget-boolean v0, p0, Lih4;->c:Z

    .line 39
    .line 40
    if-eqz v0, :cond_4

    .line 41
    .line 42
    const-string v0, "performMeasureAndLayout called during measure layout"

    .line 43
    .line 44
    invoke-static {v0}, Lyb3;->a(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_4
    iget-object v0, p0, Lih4;->i:Lk31;

    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    const/4 v2, 0x0

    .line 51
    if-eqz v0, :cond_8

    .line 52
    .line 53
    iput-boolean v1, p0, Lih4;->c:Z

    .line 54
    .line 55
    iput-boolean v2, p0, Lih4;->d:Z

    .line 56
    .line 57
    :try_start_0
    iget-object v0, p0, Lih4;->b:Lwr0;

    .line 58
    .line 59
    iget-object v3, v0, Lwr0;->x:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v3, Lji8;

    .line 62
    .line 63
    invoke-virtual {v3, p1}, Lji8;->C(Luy3;)Z

    .line 64
    .line 65
    .line 66
    iget-object v3, v0, Lwr0;->y:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v3, Lji8;

    .line 69
    .line 70
    invoke-virtual {v3, p1}, Lji8;->C(Luy3;)Z

    .line 71
    .line 72
    .line 73
    iget-object v0, v0, Lwr0;->z:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Lji8;

    .line 76
    .line 77
    invoke-virtual {v0, p1}, Lji8;->C(Luy3;)Z

    .line 78
    .line 79
    .line 80
    new-instance v0, Lk31;

    .line 81
    .line 82
    invoke-direct {v0, p2, p3}, Lk31;-><init>(J)V

    .line 83
    .line 84
    .line 85
    invoke-static {p1, v0}, Lih4;->c(Luy3;Lk31;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_5

    .line 90
    .line 91
    iget-object v0, p1, Luy3;->b0:Lyy3;

    .line 92
    .line 93
    iget-boolean v0, v0, Lyy3;->f:Z

    .line 94
    .line 95
    if-eqz v0, :cond_6

    .line 96
    .line 97
    :cond_5
    invoke-virtual {p1}, Luy3;->L()Ljava/lang/Boolean;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 102
    .line 103
    invoke-static {v0, v3}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_6

    .line 108
    .line 109
    invoke-virtual {p1}, Luy3;->M()V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :catchall_0
    move-exception p1

    .line 114
    goto :goto_2

    .line 115
    :cond_6
    :goto_1
    invoke-virtual {p0, p1}, Lih4;->f(Luy3;)V

    .line 116
    .line 117
    .line 118
    new-instance v0, Lk31;

    .line 119
    .line 120
    invoke-direct {v0, p2, p3}, Lk31;-><init>(J)V

    .line 121
    .line 122
    .line 123
    invoke-static {p1, v0}, Lih4;->d(Luy3;Lk31;)Z

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Luy3;->p()Z

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    if-eqz p2, :cond_7

    .line 131
    .line 132
    invoke-virtual {p1}, Luy3;->K()Z

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    if-eqz p2, :cond_7

    .line 137
    .line 138
    invoke-virtual {p1}, Luy3;->V()V

    .line 139
    .line 140
    .line 141
    iget-object p2, p0, Lih4;->e:Lhv2;

    .line 142
    .line 143
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    iget p3, p1, Luy3;->i0:I

    .line 147
    .line 148
    if-lez p3, :cond_7

    .line 149
    .line 150
    iget-object p2, p2, Lhv2;->y:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast p2, Leq4;

    .line 153
    .line 154
    invoke-virtual {p2, p1}, Leq4;->b(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    iput-boolean v1, p1, Luy3;->h0:Z

    .line 158
    .line 159
    :cond_7
    invoke-virtual {p0}, Lih4;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    .line 161
    .line 162
    iput-boolean v2, p0, Lih4;->c:Z

    .line 163
    .line 164
    iput-boolean v2, p0, Lih4;->d:Z

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :goto_2
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 168
    :catchall_1
    move-exception p1

    .line 169
    iput-boolean v2, p0, Lih4;->c:Z

    .line 170
    .line 171
    iput-boolean v2, p0, Lih4;->d:Z

    .line 172
    .line 173
    throw p1

    .line 174
    :cond_8
    :goto_3
    iget-object p0, p0, Lih4;->f:Leq4;

    .line 175
    .line 176
    iget-object p1, p0, Leq4;->w:[Ljava/lang/Object;

    .line 177
    .line 178
    iget p2, p0, Leq4;->y:I

    .line 179
    .line 180
    move p3, v2

    .line 181
    :goto_4
    if-ge p3, p2, :cond_14

    .line 182
    .line 183
    aget-object v0, p1, p3

    .line 184
    .line 185
    check-cast v0, Luy3;

    .line 186
    .line 187
    iget-object v0, v0, Luy3;->a0:Lo00;

    .line 188
    .line 189
    iget-object v3, v0, Lo00;->d:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v3, Lhc3;

    .line 192
    .line 193
    const/high16 v4, 0x400000

    .line 194
    .line 195
    invoke-static {v4}, Lyz4;->g(I)Z

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    if-eqz v5, :cond_9

    .line 200
    .line 201
    iget-object v6, v3, Lhc3;->r0:Lib7;

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_9
    iget-object v6, v3, Lhc3;->r0:Lib7;

    .line 205
    .line 206
    iget-object v6, v6, Lll4;->A:Lll4;

    .line 207
    .line 208
    if-nez v6, :cond_a

    .line 209
    .line 210
    goto/16 :goto_b

    .line 211
    .line 212
    :cond_a
    :goto_5
    sget-object v7, Lxz4;->m0:Ll76;

    .line 213
    .line 214
    invoke-virtual {v3, v5}, Lxz4;->e1(Z)Lll4;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    :goto_6
    if-eqz v3, :cond_13

    .line 219
    .line 220
    iget v5, v3, Lll4;->z:I

    .line 221
    .line 222
    and-int/2addr v5, v4

    .line 223
    if-eqz v5, :cond_13

    .line 224
    .line 225
    iget v5, v3, Lll4;->y:I

    .line 226
    .line 227
    and-int/2addr v5, v4

    .line 228
    if-eqz v5, :cond_12

    .line 229
    .line 230
    const/4 v5, 0x0

    .line 231
    move-object v7, v3

    .line 232
    move-object v8, v5

    .line 233
    :goto_7
    if-eqz v7, :cond_12

    .line 234
    .line 235
    instance-of v9, v7, Lby3;

    .line 236
    .line 237
    if-eqz v9, :cond_b

    .line 238
    .line 239
    check-cast v7, Lby3;

    .line 240
    .line 241
    iget-object v9, v0, Lo00;->d:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v9, Lhc3;

    .line 244
    .line 245
    invoke-interface {v7, v9}, Lby3;->l(Ldy3;)V

    .line 246
    .line 247
    .line 248
    goto :goto_a

    .line 249
    :cond_b
    iget v9, v7, Lll4;->y:I

    .line 250
    .line 251
    and-int/2addr v9, v4

    .line 252
    if-eqz v9, :cond_11

    .line 253
    .line 254
    instance-of v9, v7, Lwo1;

    .line 255
    .line 256
    if-eqz v9, :cond_11

    .line 257
    .line 258
    move-object v9, v7

    .line 259
    check-cast v9, Lwo1;

    .line 260
    .line 261
    iget-object v9, v9, Lwo1;->L:Lll4;

    .line 262
    .line 263
    move v10, v2

    .line 264
    :goto_8
    if-eqz v9, :cond_10

    .line 265
    .line 266
    iget v11, v9, Lll4;->y:I

    .line 267
    .line 268
    and-int/2addr v11, v4

    .line 269
    if-eqz v11, :cond_f

    .line 270
    .line 271
    add-int/lit8 v10, v10, 0x1

    .line 272
    .line 273
    if-ne v10, v1, :cond_c

    .line 274
    .line 275
    move-object v7, v9

    .line 276
    goto :goto_9

    .line 277
    :cond_c
    if-nez v8, :cond_d

    .line 278
    .line 279
    new-instance v8, Leq4;

    .line 280
    .line 281
    const/16 v11, 0x10

    .line 282
    .line 283
    new-array v11, v11, [Lll4;

    .line 284
    .line 285
    invoke-direct {v8, v11}, Leq4;-><init>([Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    :cond_d
    if-eqz v7, :cond_e

    .line 289
    .line 290
    invoke-virtual {v8, v7}, Leq4;->b(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    move-object v7, v5

    .line 294
    :cond_e
    invoke-virtual {v8, v9}, Leq4;->b(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    :cond_f
    :goto_9
    iget-object v9, v9, Lll4;->B:Lll4;

    .line 298
    .line 299
    goto :goto_8

    .line 300
    :cond_10
    if-ne v10, v1, :cond_11

    .line 301
    .line 302
    goto :goto_7

    .line 303
    :cond_11
    :goto_a
    invoke-static {v8}, Lrc9;->j(Leq4;)Lll4;

    .line 304
    .line 305
    .line 306
    move-result-object v7

    .line 307
    goto :goto_7

    .line 308
    :cond_12
    if-eq v3, v6, :cond_13

    .line 309
    .line 310
    iget-object v3, v3, Lll4;->B:Lll4;

    .line 311
    .line 312
    goto :goto_6

    .line 313
    :cond_13
    :goto_b
    add-int/lit8 p3, p3, 0x1

    .line 314
    .line 315
    goto/16 :goto_4

    .line 316
    .line 317
    :cond_14
    invoke-virtual {p0}, Leq4;->g()V

    .line 318
    .line 319
    .line 320
    return-void
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

.method public final n()V
    .locals 5

    .line 1
    iget-object v0, p0, Lih4;->b:Lwr0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lwr0;->T()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_6

    .line 8
    .line 9
    iget-object v1, p0, Lih4;->a:Luy3;

    .line 10
    .line 11
    invoke-virtual {v1}, Luy3;->J()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    const-string v2, "performMeasureAndLayout called with unattached root"

    .line 18
    .line 19
    invoke-static {v2}, Lyb3;->a(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {v1}, Luy3;->K()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    const-string v2, "performMeasureAndLayout called with unplaced root"

    .line 29
    .line 30
    invoke-static {v2}, Lyb3;->a(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-boolean v2, p0, Lih4;->c:Z

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    const-string v2, "performMeasureAndLayout called during measure layout"

    .line 38
    .line 39
    invoke-static {v2}, Lyb3;->a(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-object v2, p0, Lih4;->i:Lk31;

    .line 43
    .line 44
    if-eqz v2, :cond_6

    .line 45
    .line 46
    const/4 v2, 0x1

    .line 47
    iput-boolean v2, p0, Lih4;->c:Z

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    iput-boolean v3, p0, Lih4;->d:Z

    .line 51
    .line 52
    :try_start_0
    iget-object v4, v0, Lwr0;->z:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v4, Lji8;

    .line 55
    .line 56
    iget-object v4, v4, Lji8;->x:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v4, Lmy6;

    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-nez v4, :cond_3

    .line 65
    .line 66
    iget-object v0, v0, Lwr0;->x:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Lji8;

    .line 69
    .line 70
    iget-object v0, v0, Lji8;->x:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Lmy6;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_3

    .line 79
    .line 80
    move v0, v2

    .line 81
    goto :goto_0

    .line 82
    :cond_3
    move v0, v3

    .line 83
    :goto_0
    if-eqz v0, :cond_5

    .line 84
    .line 85
    iget-object v0, v1, Luy3;->D:Luy3;

    .line 86
    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    invoke-virtual {p0, v1, v2}, Lih4;->q(Luy3;Z)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :catchall_0
    move-exception v0

    .line 94
    goto :goto_2

    .line 95
    :cond_4
    invoke-virtual {p0, v1}, Lih4;->p(Luy3;)V

    .line 96
    .line 97
    .line 98
    :cond_5
    :goto_1
    invoke-virtual {p0, v1, v3}, Lih4;->q(Luy3;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    .line 100
    .line 101
    iput-boolean v3, p0, Lih4;->c:Z

    .line 102
    .line 103
    iput-boolean v3, p0, Lih4;->d:Z

    .line 104
    .line 105
    return-void

    .line 106
    :goto_2
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 107
    :catchall_1
    move-exception v0

    .line 108
    iput-boolean v3, p0, Lih4;->c:Z

    .line 109
    .line 110
    iput-boolean v3, p0, Lih4;->d:Z

    .line 111
    .line 112
    throw v0

    .line 113
    :cond_6
    return-void
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

.method public final o(Luy3;Z)Z
    .locals 2

    .line 1
    iget-boolean v0, p1, Luy3;->j0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto :goto_2

    .line 7
    :cond_0
    invoke-static {p1}, Lih4;->k(Luy3;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_4

    .line 12
    .line 13
    iget-object v0, p0, Lih4;->a:Luy3;

    .line 14
    .line 15
    if-ne p1, v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lih4;->i:Lk31;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    :goto_0
    if-eqz p2, :cond_2

    .line 25
    .line 26
    iget-object p2, p1, Luy3;->b0:Lyy3;

    .line 27
    .line 28
    iget-boolean p2, p2, Lyy3;->e:Z

    .line 29
    .line 30
    if-eqz p2, :cond_3

    .line 31
    .line 32
    invoke-static {p1, v0}, Lih4;->c(Luy3;Lk31;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    invoke-virtual {p1}, Luy3;->q()Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-eqz p2, :cond_3

    .line 42
    .line 43
    invoke-static {p1, v0}, Lih4;->d(Luy3;Lk31;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lih4;->e()V

    .line 48
    .line 49
    .line 50
    :cond_4
    :goto_2
    return v1
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
.end method

.method public final p(Luy3;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Luy3;->z()Leq4;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, Leq4;->w:[Ljava/lang/Object;

    .line 6
    .line 7
    iget p1, p1, Leq4;->y:I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, p1, :cond_3

    .line 11
    .line 12
    aget-object v2, v0, v1

    .line 13
    .line 14
    check-cast v2, Luy3;

    .line 15
    .line 16
    invoke-virtual {v2}, Luy3;->s()Lsy3;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    sget-object v4, Lsy3;->w:Lsy3;

    .line 21
    .line 22
    if-eq v3, v4, :cond_0

    .line 23
    .line 24
    iget-object v3, v2, Luy3;->b0:Lyy3;

    .line 25
    .line 26
    iget-object v3, v3, Lyy3;->p:Lkh4;

    .line 27
    .line 28
    iget-object v3, v3, Lkh4;->T:Lvy3;

    .line 29
    .line 30
    invoke-virtual {v3}, Lvy3;->e()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    :cond_0
    invoke-static {v2}, Lwe;->B(Luy3;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    invoke-virtual {p0, v2, v3}, Lih4;->q(Luy3;Z)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {p0, v2}, Lih4;->p(Luy3;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    return-void
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

.method public final q(Luy3;Z)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Luy3;->j0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lih4;->a:Luy3;

    .line 7
    .line 8
    if-ne p1, v0, :cond_1

    .line 9
    .line 10
    iget-object p0, p0, Lih4;->i:Lk31;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 p0, 0x0

    .line 17
    :goto_0
    if-eqz p2, :cond_2

    .line 18
    .line 19
    invoke-static {p1, p0}, Lih4;->c(Luy3;Lk31;)Z

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_2
    invoke-static {p1, p0}, Lih4;->d(Luy3;Lk31;)Z

    .line 24
    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
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
.end method

.method public final r(Luy3;Z)Z
    .locals 4

    .line 1
    iget-object v0, p1, Luy3;->b0:Lyy3;

    .line 2
    .line 3
    iget-object v0, v0, Lyy3;->d:Lqy3;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_6

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-eq v0, v2, :cond_6

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    if-eq v0, v3, :cond_5

    .line 17
    .line 18
    const/4 v3, 0x3

    .line 19
    if-eq v0, v3, :cond_5

    .line 20
    .line 21
    const/4 v3, 0x4

    .line 22
    if-ne v0, v3, :cond_4

    .line 23
    .line 24
    invoke-virtual {p1}, Luy3;->q()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    if-nez p2, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    iget-object p2, p1, Luy3;->b0:Lyy3;

    .line 34
    .line 35
    iget-object p2, p2, Lyy3;->p:Lkh4;

    .line 36
    .line 37
    iput-boolean v2, p2, Lkh4;->Q:Z

    .line 38
    .line 39
    iget-boolean p2, p1, Luy3;->j0:Z

    .line 40
    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {p1}, Luy3;->K()Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-nez p2, :cond_2

    .line 49
    .line 50
    invoke-static {p1}, Lih4;->j(Luy3;)Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-eqz p2, :cond_6

    .line 55
    .line 56
    :cond_2
    invoke-virtual {p1}, Luy3;->v()Luy3;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    if-eqz p2, :cond_3

    .line 61
    .line 62
    invoke-virtual {p2}, Luy3;->q()Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-ne p2, v2, :cond_3

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    iget-object p2, p0, Lih4;->b:Lwr0;

    .line 70
    .line 71
    sget-object v0, Lbh3;->y:Lbh3;

    .line 72
    .line 73
    invoke-virtual {p2, p1, v0}, Lwr0;->k(Luy3;Lbh3;)V

    .line 74
    .line 75
    .line 76
    :goto_0
    iget-boolean p0, p0, Lih4;->d:Z

    .line 77
    .line 78
    if-nez p0, :cond_6

    .line 79
    .line 80
    return v2

    .line 81
    :cond_4
    invoke-static {}, Lh;->c()V

    .line 82
    .line 83
    .line 84
    return v1

    .line 85
    :cond_5
    new-instance v0, Lhh4;

    .line 86
    .line 87
    invoke-direct {v0, p1, v1, p2}, Lhh4;-><init>(Luy3;ZZ)V

    .line 88
    .line 89
    .line 90
    iget-object p0, p0, Lih4;->h:Leq4;

    .line 91
    .line 92
    invoke-virtual {p0, v0}, Leq4;->b(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_6
    :goto_1
    return v1
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
.end method

.method public final s(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lih4;->i:Lk31;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-wide v0, v0, Lk31;->a:J

    .line 8
    .line 9
    invoke-static {v0, v1, p1, p2}, Lk31;->b(JJ)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    :goto_0
    if-nez v0, :cond_5

    .line 14
    .line 15
    iget-boolean v0, p0, Lih4;->c:Z

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    const-string v0, "updateRootConstraints called while measuring"

    .line 20
    .line 21
    invoke-static {v0}, Lyb3;->a(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    new-instance v0, Lk31;

    .line 25
    .line 26
    invoke-direct {v0, p1, p2}, Lk31;-><init>(J)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lih4;->i:Lk31;

    .line 30
    .line 31
    iget-object p1, p0, Lih4;->a:Luy3;

    .line 32
    .line 33
    invoke-virtual {p1}, Luy3;->J()Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    iget-object v0, p1, Luy3;->b0:Lyy3;

    .line 38
    .line 39
    if-nez p2, :cond_2

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    iget-object p2, p1, Luy3;->D:Luy3;

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    if-eqz p2, :cond_3

    .line 46
    .line 47
    iput-boolean v1, v0, Lyy3;->e:Z

    .line 48
    .line 49
    :cond_3
    iget-object v0, v0, Lyy3;->p:Lkh4;

    .line 50
    .line 51
    iput-boolean v1, v0, Lkh4;->Q:Z

    .line 52
    .line 53
    if-eqz p2, :cond_4

    .line 54
    .line 55
    sget-object p2, Lbh3;->w:Lbh3;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_4
    sget-object p2, Lbh3;->y:Lbh3;

    .line 59
    .line 60
    :goto_1
    iget-object p0, p0, Lih4;->b:Lwr0;

    .line 61
    .line 62
    invoke-virtual {p0, p1, p2}, Lwr0;->k(Luy3;Lbh3;)V

    .line 63
    .line 64
    .line 65
    :cond_5
    :goto_2
    return-void
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
