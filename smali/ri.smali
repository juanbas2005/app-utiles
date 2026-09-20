.class public final Lri;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Lsi;

.field public final b:Lpi;

.field public final c:Lpi;

.field public final d:Landroid/view/View;


# direct methods
.method public constructor <init>(Lsi;Lpi;Lpi;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lri;->a:Lsi;

    .line 5
    .line 6
    iput-object p2, p0, Lri;->b:Lpi;

    .line 7
    .line 8
    iput-object p3, p0, Lri;->c:Lpi;

    .line 9
    .line 10
    iput-object p4, p0, Lri;->d:Landroid/view/View;

    .line 11
    .line 12
    return-void
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
.end method


# virtual methods
.method public final a(Landroid/view/Menu;)Z
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lri;->b:Lpi;

    .line 6
    .line 7
    invoke-virtual {v2}, Lpi;->b()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Lyc7;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-static {v2, v3}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/4 v4, 0x0

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    return v4

    .line 22
    :cond_0
    invoke-interface {v1}, Landroid/view/Menu;->clear()V

    .line 23
    .line 24
    .line 25
    iget-object v2, v2, Lyc7;->a:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    const/4 v5, 0x1

    .line 32
    move v6, v4

    .line 33
    move v7, v5

    .line 34
    move v8, v7

    .line 35
    :goto_0
    if-ge v6, v3, :cond_e

    .line 36
    .line 37
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    check-cast v9, Lxc7;

    .line 42
    .line 43
    instance-of v10, v9, Lhd7;

    .line 44
    .line 45
    const/4 v11, 0x2

    .line 46
    if-eqz v10, :cond_6

    .line 47
    .line 48
    add-int/lit8 v10, v7, 0x1

    .line 49
    .line 50
    iget-object v12, v9, Lxc7;->a:Ljava/lang/Object;

    .line 51
    .line 52
    sget-object v13, Lhj8;->k:Ljava/lang/Object;

    .line 53
    .line 54
    invoke-static {v12, v13}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v13

    .line 58
    if-eqz v13, :cond_1

    .line 59
    .line 60
    const v12, 0x1020020

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    sget-object v13, Lhj8;->l:Ljava/lang/Object;

    .line 65
    .line 66
    invoke-static {v12, v13}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v13

    .line 70
    if-eqz v13, :cond_2

    .line 71
    .line 72
    const v12, 0x1020021

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    sget-object v13, Lhj8;->m:Ljava/lang/Object;

    .line 77
    .line 78
    invoke-static {v12, v13}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v13

    .line 82
    if-eqz v13, :cond_3

    .line 83
    .line 84
    const v12, 0x1020022

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    sget-object v13, Lhj8;->n:Ljava/lang/Object;

    .line 89
    .line 90
    invoke-static {v12, v13}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v13

    .line 94
    if-eqz v13, :cond_4

    .line 95
    .line 96
    const v12, 0x102001f

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    sget-object v13, Lhj8;->o:Ljava/lang/Object;

    .line 101
    .line 102
    invoke-static {v12, v13}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v12

    .line 106
    if-eqz v12, :cond_5

    .line 107
    .line 108
    const v12, 0x1020043

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_5
    move v12, v7

    .line 113
    :goto_1
    check-cast v9, Lhd7;

    .line 114
    .line 115
    iget-object v13, v9, Lhd7;->b:Ljava/lang/String;

    .line 116
    .line 117
    invoke-interface {v1, v8, v12, v7, v13}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    invoke-interface {v7, v11}, Landroid/view/MenuItem;->setShowAsAction(I)V

    .line 122
    .line 123
    .line 124
    new-instance v11, Lqi;

    .line 125
    .line 126
    invoke-direct {v11, v4, v9, v0}, Lqi;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-interface {v7, v11}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 130
    .line 131
    .line 132
    :goto_2
    move v7, v10

    .line 133
    goto/16 :goto_6

    .line 134
    .line 135
    :cond_6
    instance-of v10, v9, Lnd7;

    .line 136
    .line 137
    if-eqz v10, :cond_c

    .line 138
    .line 139
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 140
    .line 141
    const/16 v12, 0x1c

    .line 142
    .line 143
    if-lt v10, v12, :cond_d

    .line 144
    .line 145
    add-int/lit8 v10, v7, 0x1

    .line 146
    .line 147
    iget-object v12, v0, Lri;->d:Landroid/view/View;

    .line 148
    .line 149
    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 150
    .line 151
    .line 152
    move-result-object v12

    .line 153
    check-cast v9, Lnd7;

    .line 154
    .line 155
    iget-object v13, v9, Lnd7;->b:Landroid/view/textclassifier/TextClassification;

    .line 156
    .line 157
    iget v14, v9, Lnd7;->c:I

    .line 158
    .line 159
    iget-object v9, v9, Lnd7;->d:Landroid/graphics/drawable/Drawable;

    .line 160
    .line 161
    const v15, 0x1020041

    .line 162
    .line 163
    .line 164
    if-gez v14, :cond_7

    .line 165
    .line 166
    invoke-static {v13}, Lpc7;->j(Landroid/view/textclassifier/TextClassification;)Ljava/lang/CharSequence;

    .line 167
    .line 168
    .line 169
    move-result-object v14

    .line 170
    invoke-interface {v1, v15, v15, v7, v14}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    invoke-interface {v7, v11}, Landroid/view/MenuItem;->setShowAsAction(I)V

    .line 175
    .line 176
    .line 177
    invoke-interface {v7, v9}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 178
    .line 179
    .line 180
    new-instance v9, Lqi;

    .line 181
    .line 182
    invoke-direct {v9, v5, v12, v13}, Lqi;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    invoke-interface {v7, v9}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 186
    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_7
    if-nez v14, :cond_8

    .line 190
    .line 191
    move v12, v5

    .line 192
    goto :goto_3

    .line 193
    :cond_8
    move v12, v4

    .line 194
    :goto_3
    invoke-static {v13}, Led7;->d(Landroid/view/textclassifier/TextClassification;)Ljava/util/List;

    .line 195
    .line 196
    .line 197
    move-result-object v13

    .line 198
    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v13

    .line 202
    invoke-static {v13}, Lpc7;->e(Ljava/lang/Object;)Landroid/app/RemoteAction;

    .line 203
    .line 204
    .line 205
    move-result-object v13

    .line 206
    if-eqz v12, :cond_9

    .line 207
    .line 208
    move v14, v15

    .line 209
    goto :goto_4

    .line 210
    :cond_9
    move v14, v4

    .line 211
    :goto_4
    invoke-static {v13}, Lpc7;->i(Landroid/app/RemoteAction;)Ljava/lang/CharSequence;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    invoke-interface {v1, v15, v14, v7, v4}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    if-eqz v12, :cond_a

    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_a
    const/4 v11, 0x0

    .line 223
    :goto_5
    invoke-interface {v4, v11}, Landroid/view/MenuItem;->setShowAsAction(I)V

    .line 224
    .line 225
    .line 226
    if-eqz v9, :cond_b

    .line 227
    .line 228
    invoke-interface {v4, v9}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 229
    .line 230
    .line 231
    :cond_b
    new-instance v7, Lvg7;

    .line 232
    .line 233
    invoke-direct {v7, v13}, Lvg7;-><init>(Landroid/app/RemoteAction;)V

    .line 234
    .line 235
    .line 236
    invoke-interface {v4, v7}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 237
    .line 238
    .line 239
    goto :goto_2

    .line 240
    :cond_c
    instance-of v4, v9, Lld7;

    .line 241
    .line 242
    if-eqz v4, :cond_d

    .line 243
    .line 244
    add-int/lit8 v8, v8, 0x1

    .line 245
    .line 246
    :cond_d
    :goto_6
    add-int/lit8 v6, v6, 0x1

    .line 247
    .line 248
    const/4 v4, 0x0

    .line 249
    goto/16 :goto_0

    .line 250
    .line 251
    :cond_e
    return v5
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
.end method
