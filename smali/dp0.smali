.class public final synthetic Ldp0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lok6;


# direct methods
.method public synthetic constructor <init>(Lok6;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldp0;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Ldp0;->x:Lok6;

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
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Ldp0;->w:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lij7;->x:Lij7;

    .line 5
    .line 6
    sget-object v3, Lij7;->w:Lij7;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object p0, p0, Ldp0;->x:Lok6;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, Lag;

    .line 16
    .line 17
    iget-object v0, p1, Lag;->a:Landroid/view/autofill/AutofillValue;

    .line 18
    .line 19
    invoke-static {v0}, Lr4;->x(Landroid/view/autofill/AutofillValue;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object p1, p1, Lag;->a:Landroid/view/autofill/AutofillValue;

    .line 26
    .line 27
    invoke-static {p1}, Lr4;->z(Landroid/view/autofill/AutofillValue;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    :cond_0
    if-eqz v4, :cond_2

    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    move-object v2, v3

    .line 44
    :cond_1
    invoke-static {p0, v2}, Lmk6;->h(Lok6;Lij7;)V

    .line 45
    .line 46
    .line 47
    move v1, v5

    .line 48
    :cond_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :pswitch_0
    check-cast p1, Lag;

    .line 54
    .line 55
    iget-object v0, p1, Lag;->a:Landroid/view/autofill/AutofillValue;

    .line 56
    .line 57
    invoke-static {v0}, Lr4;->x(Landroid/view/autofill/AutofillValue;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    iget-object p1, p1, Lag;->a:Landroid/view/autofill/AutofillValue;

    .line 64
    .line 65
    invoke-static {p1}, Lr4;->z(Landroid/view/autofill/AutofillValue;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    :cond_3
    if-eqz v4, :cond_5

    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eqz p1, :cond_4

    .line 80
    .line 81
    move-object v2, v3

    .line 82
    :cond_4
    invoke-static {p0, v2}, Lmk6;->h(Lok6;Lij7;)V

    .line 83
    .line 84
    .line 85
    move v1, v5

    .line 86
    :cond_5
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_1
    check-cast p1, Lln7;

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    check-cast p1, Lhd5;

    .line 97
    .line 98
    iput-boolean v5, p1, Lhd5;->L:Z

    .line 99
    .line 100
    iget-object v0, p1, Lhd5;->K:Lg5;

    .line 101
    .line 102
    invoke-virtual {v0, p0}, Lg5;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    invoke-static {p1}, Lg75;->D(Ldk6;)V

    .line 106
    .line 107
    .line 108
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 109
    .line 110
    return-object p0

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
