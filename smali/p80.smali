.class public final synthetic Lp80;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lg35;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ly80;


# direct methods
.method public synthetic constructor <init>(Ly80;I)V
    .locals 0

    .line 1
    iput p2, p0, Lp80;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lp80;->x:Ly80;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
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


# virtual methods
.method public final m(Ljava/lang/Object;)V
    .locals 9

    .line 1
    iget v0, p0, Lp80;->w:I

    .line 2
    .line 3
    const v1, 0x7f1100d3

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object p0, p0, Lp80;->x:Ly80;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, v3}, Ly80;->P(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ly80;->Q()V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Ly80;->t0:Lf90;

    .line 29
    .line 30
    iget-object p1, p0, Lf90;->v:Lbp4;

    .line 31
    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    new-instance p1, Lbp4;

    .line 35
    .line 36
    invoke-direct {p1}, Lbp4;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lf90;->v:Lbp4;

    .line 40
    .line 41
    :cond_0
    iget-object p0, p0, Lf90;->v:Lbp4;

    .line 42
    .line 43
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-static {p0, p1}, Lf90;->h(Lbp4;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void

    .line 49
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_6

    .line 56
    .line 57
    invoke-virtual {p0}, Ly80;->S()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    invoke-virtual {p0}, Ly80;->U()V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    iget-object p1, p0, Ly80;->t0:Lf90;

    .line 68
    .line 69
    iget-object v0, p1, Lf90;->h:Ljava/lang/String;

    .line 70
    .line 71
    if-eqz v0, :cond_3

    .line 72
    .line 73
    move-object v4, v0

    .line 74
    goto :goto_0

    .line 75
    :cond_3
    iget-object p1, p1, Lf90;->d:Lqc3;

    .line 76
    .line 77
    if-eqz p1, :cond_4

    .line 78
    .line 79
    const-string v4, ""

    .line 80
    .line 81
    :cond_4
    :goto_0
    if-eqz v4, :cond_5

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_5
    invoke-virtual {p0, v1}, Lbq2;->q(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    :goto_1
    const/16 p1, 0xd

    .line 89
    .line 90
    invoke-virtual {p0, p1, v4}, Ly80;->V(ILjava/lang/CharSequence;)V

    .line 91
    .line 92
    .line 93
    const/4 p1, 0x2

    .line 94
    invoke-virtual {p0, p1}, Ly80;->P(I)V

    .line 95
    .line 96
    .line 97
    :goto_2
    iget-object p0, p0, Ly80;->t0:Lf90;

    .line 98
    .line 99
    invoke-virtual {p0, v2}, Lf90;->g(Z)V

    .line 100
    .line 101
    .line 102
    :cond_6
    return-void

    .line 103
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_b

    .line 110
    .line 111
    invoke-virtual {p0}, Ly80;->T()Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-eqz p1, :cond_7

    .line 116
    .line 117
    const p1, 0x7f11011b

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, p1}, Lbq2;->q(I)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {p0, p1}, Ly80;->Y(Ljava/lang/CharSequence;)V

    .line 125
    .line 126
    .line 127
    :cond_7
    iget-object p1, p0, Ly80;->t0:Lf90;

    .line 128
    .line 129
    iget-boolean v0, p1, Lf90;->k:Z

    .line 130
    .line 131
    if-nez v0, :cond_8

    .line 132
    .line 133
    const-string p1, "BiometricFragment"

    .line 134
    .line 135
    const-string v0, "Failure not sent to client. Client is not awaiting a result."

    .line 136
    .line 137
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 138
    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_8
    iget-object p1, p1, Lf90;->b:Ljava/util/concurrent/Executor;

    .line 142
    .line 143
    if-eqz p1, :cond_9

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_9
    new-instance p1, Lw80;

    .line 147
    .line 148
    invoke-direct {p1, v3}, Lw80;-><init>(I)V

    .line 149
    .line 150
    .line 151
    :goto_3
    new-instance v0, Lq80;

    .line 152
    .line 153
    invoke-direct {v0, p0}, Lq80;-><init>(Ly80;)V

    .line 154
    .line 155
    .line 156
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 157
    .line 158
    .line 159
    :goto_4
    iget-object p0, p0, Ly80;->t0:Lf90;

    .line 160
    .line 161
    iget-object p1, p0, Lf90;->s:Lbp4;

    .line 162
    .line 163
    if-nez p1, :cond_a

    .line 164
    .line 165
    new-instance p1, Lbp4;

    .line 166
    .line 167
    invoke-direct {p1}, Lbp4;-><init>()V

    .line 168
    .line 169
    .line 170
    iput-object p1, p0, Lf90;->s:Lbp4;

    .line 171
    .line 172
    :cond_a
    iget-object p0, p0, Lf90;->s:Lbp4;

    .line 173
    .line 174
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 175
    .line 176
    invoke-static {p0, p1}, Lf90;->h(Lbp4;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    :cond_b
    return-void

    .line 180
    :pswitch_2
    check-cast p1, Ljava/lang/CharSequence;

    .line 181
    .line 182
    if-eqz p1, :cond_d

    .line 183
    .line 184
    invoke-virtual {p0}, Ly80;->T()Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-eqz v0, :cond_c

    .line 189
    .line 190
    invoke-virtual {p0, p1}, Ly80;->Y(Ljava/lang/CharSequence;)V

    .line 191
    .line 192
    .line 193
    :cond_c
    iget-object p0, p0, Ly80;->t0:Lf90;

    .line 194
    .line 195
    invoke-virtual {p0, v4}, Lf90;->f(Lo80;)V

    .line 196
    .line 197
    .line 198
    :cond_d
    return-void

    .line 199
    :pswitch_3
    check-cast p1, Lo80;

    .line 200
    .line 201
    if-eqz p1, :cond_1c

    .line 202
    .line 203
    iget v0, p1, Lo80;->a:I

    .line 204
    .line 205
    iget-object p1, p1, Lo80;->b:Ljava/lang/CharSequence;

    .line 206
    .line 207
    packed-switch v0, :pswitch_data_1

    .line 208
    .line 209
    .line 210
    :pswitch_4
    const/16 v0, 0x8

    .line 211
    .line 212
    :pswitch_5
    invoke-virtual {p0}, Lbq2;->n()Landroid/content/Context;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 217
    .line 218
    const/16 v7, 0x1d

    .line 219
    .line 220
    if-ge v6, v7, :cond_10

    .line 221
    .line 222
    const/4 v7, 0x7

    .line 223
    if-eq v0, v7, :cond_e

    .line 224
    .line 225
    const/16 v7, 0x9

    .line 226
    .line 227
    if-ne v0, v7, :cond_10

    .line 228
    .line 229
    :cond_e
    if-eqz v5, :cond_10

    .line 230
    .line 231
    invoke-static {v5}, Lht3;->a(Landroid/content/Context;)Landroid/app/KeyguardManager;

    .line 232
    .line 233
    .line 234
    move-result-object v5

    .line 235
    if-nez v5, :cond_f

    .line 236
    .line 237
    move v5, v2

    .line 238
    goto :goto_5

    .line 239
    :cond_f
    invoke-static {v5}, Lht3;->b(Landroid/app/KeyguardManager;)Z

    .line 240
    .line 241
    .line 242
    move-result v5

    .line 243
    :goto_5
    if-eqz v5, :cond_10

    .line 244
    .line 245
    iget-object v5, p0, Ly80;->t0:Lf90;

    .line 246
    .line 247
    invoke-virtual {v5}, Lf90;->e()I

    .line 248
    .line 249
    .line 250
    move-result v5

    .line 251
    invoke-static {v5}, Luq3;->A(I)Z

    .line 252
    .line 253
    .line 254
    move-result v5

    .line 255
    if-eqz v5, :cond_10

    .line 256
    .line 257
    invoke-virtual {p0}, Ly80;->U()V

    .line 258
    .line 259
    .line 260
    goto/16 :goto_c

    .line 261
    .line 262
    :cond_10
    invoke-virtual {p0}, Ly80;->T()Z

    .line 263
    .line 264
    .line 265
    move-result v5

    .line 266
    if-eqz v5, :cond_1a

    .line 267
    .line 268
    if-eqz p1, :cond_11

    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_11
    invoke-virtual {p0}, Lbq2;->n()Landroid/content/Context;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    invoke-static {p1, v0}, Lgw8;->w(Landroid/content/Context;I)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    :goto_6
    iget-object v1, p0, Ly80;->t0:Lf90;

    .line 280
    .line 281
    const/4 v5, 0x5

    .line 282
    if-ne v0, v5, :cond_14

    .line 283
    .line 284
    iget v1, v1, Lf90;->i:I

    .line 285
    .line 286
    if-eqz v1, :cond_12

    .line 287
    .line 288
    const/4 v2, 0x3

    .line 289
    if-ne v1, v2, :cond_13

    .line 290
    .line 291
    :cond_12
    invoke-virtual {p0, v0, p1}, Ly80;->W(ILjava/lang/CharSequence;)V

    .line 292
    .line 293
    .line 294
    :cond_13
    invoke-virtual {p0}, Ly80;->Q()V

    .line 295
    .line 296
    .line 297
    goto/16 :goto_c

    .line 298
    .line 299
    :cond_14
    iget-boolean v1, v1, Lf90;->u:Z

    .line 300
    .line 301
    if-eqz v1, :cond_15

    .line 302
    .line 303
    invoke-virtual {p0, v0, p1}, Ly80;->V(ILjava/lang/CharSequence;)V

    .line 304
    .line 305
    .line 306
    goto :goto_a

    .line 307
    :cond_15
    invoke-virtual {p0, p1}, Ly80;->Y(Ljava/lang/CharSequence;)V

    .line 308
    .line 309
    .line 310
    iget-object v1, p0, Ly80;->u0:Landroid/os/Handler;

    .line 311
    .line 312
    new-instance v5, Lr80;

    .line 313
    .line 314
    invoke-direct {v5, p0, v0, p1, v2}, Lr80;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {p0}, Lbq2;->n()Landroid/content/Context;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    if-eqz p1, :cond_19

    .line 322
    .line 323
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 324
    .line 325
    const/16 v7, 0x1c

    .line 326
    .line 327
    if-eq v6, v7, :cond_16

    .line 328
    .line 329
    goto :goto_8

    .line 330
    :cond_16
    if-nez v0, :cond_17

    .line 331
    .line 332
    goto :goto_8

    .line 333
    :cond_17
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    const v6, 0x7f030004

    .line 338
    .line 339
    .line 340
    invoke-virtual {p1, v6}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    array-length v6, p1

    .line 345
    move v7, v2

    .line 346
    :goto_7
    if-ge v7, v6, :cond_19

    .line 347
    .line 348
    aget-object v8, p1, v7

    .line 349
    .line 350
    invoke-virtual {v0, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 351
    .line 352
    .line 353
    move-result v8

    .line 354
    if-eqz v8, :cond_18

    .line 355
    .line 356
    goto :goto_9

    .line 357
    :cond_18
    add-int/lit8 v7, v7, 0x1

    .line 358
    .line 359
    goto :goto_7

    .line 360
    :cond_19
    :goto_8
    const/16 v2, 0x7d0

    .line 361
    .line 362
    :goto_9
    int-to-long v6, v2

    .line 363
    invoke-virtual {v1, v5, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 364
    .line 365
    .line 366
    :goto_a
    iget-object p1, p0, Ly80;->t0:Lf90;

    .line 367
    .line 368
    iput-boolean v3, p1, Lf90;->u:Z

    .line 369
    .line 370
    goto :goto_c

    .line 371
    :cond_1a
    if-eqz p1, :cond_1b

    .line 372
    .line 373
    goto :goto_b

    .line 374
    :cond_1b
    new-instance p1, Ljava/lang/StringBuilder;

    .line 375
    .line 376
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 377
    .line 378
    .line 379
    invoke-virtual {p0, v1}, Lbq2;->q(I)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    const-string v1, " "

    .line 387
    .line 388
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object p1

    .line 398
    :goto_b
    invoke-virtual {p0, v0, p1}, Ly80;->V(ILjava/lang/CharSequence;)V

    .line 399
    .line 400
    .line 401
    :goto_c
    iget-object p0, p0, Ly80;->t0:Lf90;

    .line 402
    .line 403
    invoke-virtual {p0, v4}, Lf90;->f(Lo80;)V

    .line 404
    .line 405
    .line 406
    :cond_1c
    return-void

    .line 407
    :pswitch_6
    check-cast p1, Lb90;

    .line 408
    .line 409
    if-eqz p1, :cond_1e

    .line 410
    .line 411
    invoke-virtual {p0, p1}, Ly80;->X(Lb90;)V

    .line 412
    .line 413
    .line 414
    iget-object p0, p0, Ly80;->t0:Lf90;

    .line 415
    .line 416
    iget-object p1, p0, Lf90;->p:Lbp4;

    .line 417
    .line 418
    if-nez p1, :cond_1d

    .line 419
    .line 420
    new-instance p1, Lbp4;

    .line 421
    .line 422
    invoke-direct {p1}, Lbp4;-><init>()V

    .line 423
    .line 424
    .line 425
    iput-object p1, p0, Lf90;->p:Lbp4;

    .line 426
    .line 427
    :cond_1d
    iget-object p0, p0, Lf90;->p:Lbp4;

    .line 428
    .line 429
    invoke-static {p0, v4}, Lf90;->h(Lbp4;Ljava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    :cond_1e
    return-void

    .line 433
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 434
    .line 435
    .line 436
    .line 437
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
    .end packed-switch
.end method
