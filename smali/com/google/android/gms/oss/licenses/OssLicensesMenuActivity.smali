.class public final Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;
.super Lyn;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static Z:Ljava/lang/String;


# instance fields
.field public X:Z

.field public Y:Lk68;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lyn;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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

.method public static t(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;Ljava/lang/String;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    invoke-virtual {p0}, Lyn;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const v2, 0x7f090118

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "raw"

    .line 15
    .line 16
    invoke-virtual {p0, p1, v3, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    .line 25
    .line 26
    .line 27
    move-result p0
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    if-lez p0, :cond_0

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 32
    .line 33
    .line 34
    :catch_0
    return v1

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 39
    .line 40
    .line 41
    :catch_1
    :cond_1
    throw p0

    .line 42
    :catch_2
    if-eqz v0, :cond_2

    .line 43
    .line 44
    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 45
    .line 46
    .line 47
    :catch_3
    :cond_2
    return v1
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 10

    .line 1
    invoke-super {p0, p1}, Leq2;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lk68;->m(Landroid/content/Context;)Lk68;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->Y:Lk68;

    .line 9
    .line 10
    sget-boolean v0, Lqi8;->a:Z

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {p0}, Ly12;->b(Lyn;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0, v1}, Lo55;->s(Landroid/view/Window;Z)V

    .line 24
    .line 25
    .line 26
    :goto_0
    const v0, 0x7f0c0034

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lyn;->setContentView(I)V

    .line 30
    .line 31
    .line 32
    const-string v0, "third_party_licenses"

    .line 33
    .line 34
    invoke-static {p0, v0}, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->t(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/4 v2, 0x0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    const-string v0, "third_party_license_metadata"

    .line 42
    .line 43
    invoke-static {p0, v0}, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->t(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    move v0, v1

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    move v0, v2

    .line 52
    :goto_1
    iput-boolean v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->X:Z

    .line 53
    .line 54
    sget-object v0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->Z:Ljava/lang/String;

    .line 55
    .line 56
    if-nez v0, :cond_2

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v3, "title"

    .line 63
    .line 64
    invoke-virtual {v0, v3}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_2

    .line 69
    .line 70
    invoke-virtual {v0, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    sput-object v0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->Z:Ljava/lang/String;

    .line 75
    .line 76
    const-string v0, "OssLicensesMenuActivity"

    .line 77
    .line 78
    const-string v3, "The intent based title is deprecated. Use OssLicensesMenuActivity.setActivityTitle(title) instead."

    .line 79
    .line 80
    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    :cond_2
    sget-object v0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->Z:Ljava/lang/String;

    .line 84
    .line 85
    if-eqz v0, :cond_3

    .line 86
    .line 87
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 88
    .line 89
    .line 90
    :cond_3
    invoke-virtual {p0}, Lyn;->s()Lu98;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-eqz v0, :cond_4

    .line 95
    .line 96
    invoke-virtual {p0}, Lyn;->s()Lu98;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    iget-object v3, v0, Lu98;->e:Lsk1;

    .line 104
    .line 105
    check-cast v3, Lsj7;

    .line 106
    .line 107
    iget v4, v3, Lsj7;->b:I

    .line 108
    .line 109
    iput-boolean v1, v0, Lu98;->h:Z

    .line 110
    .line 111
    and-int/lit8 v0, v4, -0x5

    .line 112
    .line 113
    const/4 v4, 0x4

    .line 114
    or-int/2addr v0, v4

    .line 115
    invoke-virtual {v3, v0}, Lsj7;->a(I)V

    .line 116
    .line 117
    .line 118
    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->Y:Lk68;

    .line 119
    .line 120
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-virtual {v0, v3}, Lk68;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-static {p0, v0}, Lk68;->q(Landroid/content/Context;Ljava/lang/String;)Ls47;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    iget-object v4, v3, Ls47;->b:Ljava/lang/String;

    .line 133
    .line 134
    iget-object v3, v3, Ls47;->a:Landroid/content/res/Resources;

    .line 135
    .line 136
    iget-boolean v5, p0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->X:Z

    .line 137
    .line 138
    const-string v6, "This transaction is already being added to the back stack"

    .line 139
    .line 140
    const-string v7, "id"

    .line 141
    .line 142
    const-string v8, "license_fragment_container"

    .line 143
    .line 144
    const/4 v9, 0x0

    .line 145
    if-eqz v5, :cond_8

    .line 146
    .line 147
    if-nez p1, :cond_7

    .line 148
    .line 149
    invoke-static {p0}, Lk68;->m(Landroid/content/Context;)Lk68;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3, v8, v7, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    invoke-virtual {p0}, Leq2;->p()Lrq2;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-virtual {v3, p1}, Lrq2;->D(I)Lbq2;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    check-cast v3, Lq89;

    .line 165
    .line 166
    if-nez v3, :cond_a

    .line 167
    .line 168
    new-instance v3, Lq89;

    .line 169
    .line 170
    invoke-direct {v3}, Lq89;-><init>()V

    .line 171
    .line 172
    .line 173
    if-eqz v0, :cond_5

    .line 174
    .line 175
    new-instance v4, Landroid/os/Bundle;

    .line 176
    .line 177
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 178
    .line 179
    .line 180
    const-string v5, "license_activity_package_name"

    .line 181
    .line 182
    invoke-virtual {v4, v5, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v3, v4}, Lbq2;->O(Landroid/os/Bundle;)V

    .line 186
    .line 187
    .line 188
    :cond_5
    invoke-virtual {p0}, Leq2;->p()Lrq2;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    new-instance v0, Lq30;

    .line 196
    .line 197
    invoke-direct {v0, p0}, Lq30;-><init>(Lrq2;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, p1, v3, v9, v1}, Lq30;->f(ILbq2;Ljava/lang/String;I)V

    .line 201
    .line 202
    .line 203
    iget-boolean p0, v0, Lq30;->g:Z

    .line 204
    .line 205
    if-nez p0, :cond_6

    .line 206
    .line 207
    iget-object p0, v0, Lq30;->q:Lrq2;

    .line 208
    .line 209
    invoke-virtual {p0, v0, v2}, Lrq2;->B(Lq30;Z)V

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :cond_6
    invoke-static {v6}, Lh;->s(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    :cond_7
    return-void

    .line 217
    :cond_8
    if-nez p1, :cond_a

    .line 218
    .line 219
    invoke-static {p0}, Lk68;->m(Landroid/content/Context;)Lk68;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v3, v8, v7, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    invoke-virtual {p0}, Leq2;->p()Lrq2;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-virtual {v0, p1}, Lrq2;->D(I)Lbq2;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    check-cast v0, Lys8;

    .line 235
    .line 236
    if-nez v0, :cond_a

    .line 237
    .line 238
    new-instance v0, Lys8;

    .line 239
    .line 240
    invoke-direct {v0}, Lys8;-><init>()V

    .line 241
    .line 242
    .line 243
    invoke-virtual {p0}, Leq2;->p()Lrq2;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    new-instance v3, Lq30;

    .line 251
    .line 252
    invoke-direct {v3, p0}, Lq30;-><init>(Lrq2;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v3, p1, v0, v9, v1}, Lq30;->f(ILbq2;Ljava/lang/String;I)V

    .line 256
    .line 257
    .line 258
    iget-boolean p0, v3, Lq30;->g:Z

    .line 259
    .line 260
    if-nez p0, :cond_9

    .line 261
    .line 262
    iget-object p0, v3, Lq30;->q:Lrq2;

    .line 263
    .line 264
    invoke-virtual {p0, v3, v2}, Lrq2;->B(Lq30;Z)V

    .line 265
    .line 266
    .line 267
    return-void

    .line 268
    :cond_9
    invoke-static {v6}, Lh;->s(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    :cond_a
    return-void
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

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x102002c

    .line 6
    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
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
.end method
