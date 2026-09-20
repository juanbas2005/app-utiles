.class public final Lfg4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lkg4;Lcom/google/android/material/datepicker/c;I)V
    .locals 0

    .line 49
    iput p3, p0, Lfg4;->w:I

    iput-object p1, p0, Lfg4;->y:Ljava/lang/Object;

    iput-object p2, p0, Lfg4;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lsj7;)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lfg4;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lfg4;->y:Ljava/lang/Object;

    .line 8
    .line 9
    new-instance v0, Lx7;

    .line 10
    .line 11
    iget-object v1, p1, Lsj7;->a:Landroidx/appcompat/widget/Toolbar;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object p1, p1, Lsj7;->h:Ljava/lang/CharSequence;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    const/16 v2, 0x1000

    .line 23
    .line 24
    iput v2, v0, Lx7;->e:I

    .line 25
    .line 26
    iput v2, v0, Lx7;->g:I

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    iput-object v2, v0, Lx7;->l:Landroid/content/res/ColorStateList;

    .line 30
    .line 31
    iput-object v2, v0, Lx7;->m:Landroid/graphics/PorterDuff$Mode;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    iput-boolean v2, v0, Lx7;->n:Z

    .line 35
    .line 36
    iput-boolean v2, v0, Lx7;->o:Z

    .line 37
    .line 38
    const/16 v2, 0x10

    .line 39
    .line 40
    iput v2, v0, Lx7;->p:I

    .line 41
    .line 42
    iput-object v1, v0, Lx7;->i:Landroid/content/Context;

    .line 43
    .line 44
    iput-object p1, v0, Lx7;->a:Ljava/lang/CharSequence;

    .line 45
    .line 46
    iput-object v0, p0, Lfg4;->x:Ljava/lang/Object;

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


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget p1, p0, Lfg4;->w:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/4 v1, 0x0

    .line 5
    iget-object v2, p0, Lfg4;->x:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, Lfg4;->y:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lsj7;

    .line 13
    .line 14
    iget-object p1, p0, Lsj7;->k:Landroid/view/Window$Callback;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-boolean p0, p0, Lsj7;->l:Z

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    check-cast v2, Lx7;

    .line 23
    .line 24
    invoke-interface {p1, v1, v2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void

    .line 28
    :pswitch_0
    check-cast p0, Lkg4;

    .line 29
    .line 30
    iget-object p1, p0, Lkg4;->A0:Landroidx/recyclerview/widget/RecyclerView;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lxy5;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 37
    .line 38
    invoke-virtual {p1}, Lxy5;->v()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    invoke-virtual {p1, v1, v3, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->N0(IIZ)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-nez p1, :cond_1

    .line 47
    .line 48
    const/4 p1, -0x1

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-static {p1}, Lxy5;->H(Landroid/view/View;)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    :goto_0
    check-cast v2, Lcom/google/android/material/datepicker/c;

    .line 55
    .line 56
    add-int/lit8 p1, p1, 0x1

    .line 57
    .line 58
    iget-object v1, v2, Lcom/google/android/material/datepicker/c;->d:Lsh0;

    .line 59
    .line 60
    iget-object v1, v1, Lsh0;->w:Lzl4;

    .line 61
    .line 62
    iget-object v1, v1, Lzl4;->w:Ljava/util/Calendar;

    .line 63
    .line 64
    invoke-static {v1}, La08;->a(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1, v0, p1}, Ljava/util/Calendar;->add(II)V

    .line 69
    .line 70
    .line 71
    new-instance p1, Lzl4;

    .line 72
    .line 73
    invoke-direct {p1, v1}, Lzl4;-><init>(Ljava/util/Calendar;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, p1}, Lkg4;->P(Lzl4;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :pswitch_1
    check-cast p0, Lkg4;

    .line 81
    .line 82
    iget-object p1, p0, Lkg4;->A0:Landroidx/recyclerview/widget/RecyclerView;

    .line 83
    .line 84
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lxy5;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 89
    .line 90
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->L0()I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    check-cast v2, Lcom/google/android/material/datepicker/c;

    .line 95
    .line 96
    add-int/lit8 p1, p1, -0x1

    .line 97
    .line 98
    iget-object v1, v2, Lcom/google/android/material/datepicker/c;->d:Lsh0;

    .line 99
    .line 100
    iget-object v1, v1, Lsh0;->w:Lzl4;

    .line 101
    .line 102
    iget-object v1, v1, Lzl4;->w:Ljava/util/Calendar;

    .line 103
    .line 104
    invoke-static {v1}, La08;->a(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v1, v0, p1}, Ljava/util/Calendar;->add(II)V

    .line 109
    .line 110
    .line 111
    new-instance p1, Lzl4;

    .line 112
    .line 113
    invoke-direct {p1, v1}, Lzl4;-><init>(Ljava/util/Calendar;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, p1}, Lkg4;->P(Lzl4;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
